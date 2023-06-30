package intermediario.excecoes;

import intermediario.excecoes.domain.Funcionario;
import intermediario.excecoes.domain.LoginInvalidoException;
import intermediario.excecoes.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
