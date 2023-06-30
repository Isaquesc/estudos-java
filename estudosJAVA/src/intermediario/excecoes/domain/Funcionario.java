package intermediario.excecoes.domain;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa {

    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Funcionario");
    }
}
