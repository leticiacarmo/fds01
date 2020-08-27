import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Veiculo> veiculos;

    private ArrayList<Carro> carros;
    private ArrayList<Moto> motos;
    private ArrayList<Caminhao> caminhoes;

    public Catalogo() {
        carros = new ArrayList<Carro>();
        motos= new ArrayList<Moto>();
        caminhoes= new ArrayList<Caminhao>();
    }

    public void addCarro (Carro carro){
        carros.add(carro);

    }
    public void addMoto (Moto moto){
        motos.add(moto);

    }
    public void addCaminhao (Caminhao caminhao){
        caminhoes.add(caminhao);
    }

    public void removeCarro (Veiculo carro){
        caminhoes.remove(carro);

    }public void removeMoto (Veiculo moto){
        caminhoes.remove(moto);

    }public void removeCaminhao (Veiculo caminhao){
        caminhoes.remove(caminhao);
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "carros=" + carros +
                ", motos=" + motos +
                ", caminhões=" + caminhoes +
                '}';
    }
}