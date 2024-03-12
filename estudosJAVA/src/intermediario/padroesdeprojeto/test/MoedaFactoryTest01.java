package intermediario.padroesdeprojeto.test;

import intermediario.padroesdeprojeto.dominio.MoedaFactory;
import intermediario.padroesdeprojeto.dominio.Pais;
import intermediario.padroesdeprojeto.dominio.interfaces.Moeda;

public class MoedaFactoryTest01 {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.novaMoeda(Pais.BRASIL);
        System.out.println(moeda.getMoeda());
    }
}
