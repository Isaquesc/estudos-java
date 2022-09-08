package iniciante.polimorfismo.produto.dominio;

public class Computador extends Produto{

    public static final double IMPOSTO = 21;

    public Computador(String nome, Double value) {
        super(nome, value);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando importo do Computador");
        return valor * IMPOSTO;
    }
}
