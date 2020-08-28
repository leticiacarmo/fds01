import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Veiculo> veiculos;

    public Catalogo() {
        veiculos = new ArrayList<Veiculo>();
    }

    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);

    }

    public void removeVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);

    }

}