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
    
//Filtro
//    public Veiculo pesquisar(double umPreco) {
//        String car = null;
//        for (Veiculo v : veiculos)
//            if (v.abastece(umPreco) >= umPreco);
////            car = car.add(v);
////            return car;
//
//    }

}