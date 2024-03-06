package intermediario.threads.test;

import intermediario.threads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    private Account account = new Account();

    public static void main(String[] args) throws InterruptedException {

        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Isaque");
        Thread t2 = new Thread(threadAccountTest01, "Jessica");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawl(10);
            if (account.getBalance() < 0)
                System.out.println("ZEROU A CONTA");
        }
    }

    private void withdrawl(int amount) {
        System.out.println(getNameThread() +" #### fora do synchronized");

        synchronized (account) {
            System.out.println(getNameThread() +" **** dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getNameThread() + " está indo sacar dinheiro");
                account.withDrawl(amount);
                System.out.println(getNameThread() + " - saque realizado com sucesso - SALDO ATUAL: " + account.getBalance());
            } else {
                System.out.println("Desculpe " + getNameThread() + " Saldo insuficiente: " + account.getBalance());
            }
        }
    }

    private String getNameThread() {
        return Thread.currentThread().getName();
    }
}
