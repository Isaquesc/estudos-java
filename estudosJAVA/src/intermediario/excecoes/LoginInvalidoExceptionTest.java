package intermediario.excecoes;

import intermediario.excecoes.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {

        try {
            logar();
        }catch (LoginInvalidoException e){
            System.out.println(e.getMessage());;
        }

    }

    public static void logar() throws LoginInvalidoException {
        String usuario = "Isaque";
        String senha = "melao1";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuarioDigitado = scanner.nextLine();

        System.out.println("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if (!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitada))
            throw new LoginInvalidoException("Usuario ou senha invalido");

        System.out.println("Login efetuado");
    }
}
