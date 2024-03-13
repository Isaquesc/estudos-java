package intermediario.padroesdeprojeto.factory.exemploum.test;

import intermediario.padroesdeprojeto.factory.exemploum.dominio.MoedaFactory;
import intermediario.padroesdeprojeto.factory.exemploum.dominio.Pais;
import intermediario.padroesdeprojeto.factory.exemploum.interfaces.Moeda;

public class MoedaFactoryTest01 {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.novaMoeda(Pais.BRASIL);
        System.out.println(moeda.getMoeda());
    }
}
