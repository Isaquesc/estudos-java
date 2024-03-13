package intermediario.padroesdeprojeto.factory.exemploum.dominio;

import intermediario.padroesdeprojeto.factory.exemploum.interfaces.Moeda;

public class Real implements Moeda {
    @Override
    public String getMoeda() {
        return "R$";
    }
}
