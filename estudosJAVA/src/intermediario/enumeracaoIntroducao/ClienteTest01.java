package intermediario.enumeracaoIntroducao;

import static intermediario.enumeracaoIntroducao.TipoCliente.PESSOA_FISICA;
import static intermediario.enumeracaoIntroducao.TipoCliente.PESSOA_JURIDICA;

public class ClienteTest01 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Isaque", PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Josuas", PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
