package intermediario.padroesdeprojeto.dominio;

import intermediario.padroesdeprojeto.dominio.interfaces.Moeda;

public class Real implements Moeda {
    @Override
    public String getMoeda() {
        return "R$";
    }
}
