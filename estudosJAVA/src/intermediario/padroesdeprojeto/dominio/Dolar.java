package intermediario.padroesdeprojeto.dominio;

import intermediario.padroesdeprojeto.dominio.interfaces.Moeda;

public class Dolar implements Moeda {
    @Override
    public String getMoeda() {
        return "$";
    }
}
