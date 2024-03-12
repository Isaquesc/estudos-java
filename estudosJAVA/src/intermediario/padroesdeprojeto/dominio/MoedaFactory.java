package intermediario.padroesdeprojeto.dominio;

import intermediario.padroesdeprojeto.dominio.interfaces.Moeda;

public class MoedaFactory {
    public static Moeda novaMoeda(Pais pais) {
        switch (pais) {
            case BRASIL:
                return new Real();
            case USA:
                return new Dolar();
            default:
                throw new IllegalArgumentException("moeda invalida");
        }
    }

}
