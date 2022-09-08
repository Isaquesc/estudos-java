package intermediario.enumeracaoIntroducao;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private final String NOMERELATORIO;
    private final int VALOR;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.NOMERELATORIO = nomeRelatorio;
    }

    public String getNOMERELATORIO() {
        return NOMERELATORIO;
    }

    public int getVALOR() {
        return VALOR;
    }
}
