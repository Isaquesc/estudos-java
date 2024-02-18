package intermediario.generics;

import intermediario.generics.dominio.Barco;
import intermediario.generics.dominio.Carro;
import intermediario.generics.service.VeiculoService;

import java.util.ArrayList;
import java.util.List;

public class GenericaTest01 {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>(List.of(new Carro("BMW"), new Carro("HONDA FIT")));
        List<Barco> listBarcos = new ArrayList<>(List.of(new Barco("Barco GM"), new Barco("Barco FZ")));

        VeiculoService<Barco> serviceBarco = new VeiculoService(listBarcos);

        Barco barco = serviceBarco.buscarVeiculoDisponivel();
        System.out.println("Usando o veiculo por um mês...");
        serviceBarco.devolucaoVeiculoAlugado(barco);


    }
}
