package intermediario.generics.service;

import java.util.List;

public class VeiculoService<T> {

    private List<T> veiculoDisponiveis;

    public VeiculoService(List<T> veiculoDisponiveis) {
        this.veiculoDisponiveis = veiculoDisponiveis;
    }

    public T buscarVeiculoDisponivel(){
        System.out.println("Buscando veiculo disponivel...");
        T veiculo = veiculoDisponiveis.remove(0);

        System.out.println("Alugando veiculo " + veiculo);
        System.out.println("Ts disponiveis para alugar: ");
        System.out.println(veiculoDisponiveis);

        return veiculo;
    }

    public void devolucaoVeiculoAlugado(T veiculo){
        System.out.println("Devolvendo veiculo " + veiculo);
        veiculoDisponiveis.add(veiculo);

        System.out.println("Veiculos disponiveis para alugar: ");
        System.out.println(veiculoDisponiveis);
    }
}
