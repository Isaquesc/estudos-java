package iniciante.tiposPrimitivos;

public class Funcionarios {

    private String nome;
    private int idade;
    private int[] salarios;

    public Funcionarios(String nome, int idade, int... salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (int salario : salarios) {
            System.out.println("Salario: " + salario);
        }
    }

    public void mediaSalario() {
        int media = 0;
        for (int salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media: " + media);
    }
}

class TestFuncionarios {
    public static void main(String[] args) {

        Funcionarios h = new Funcionarios("Josue", 26, 1200, 350, 4565);

        h.imprimirDados();

    }
}
