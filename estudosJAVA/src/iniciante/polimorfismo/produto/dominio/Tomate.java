package iniciante.polimorfismo.produto.dominio;

public class Tomate extends Produto{

    public static final double IMPOSTO = 15;

    public Tomate(String nome, Double value) {
        super(nome, value);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return valor * IMPOSTO;
    }
}