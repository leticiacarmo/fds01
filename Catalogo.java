import java.util.ArrayList;

public class Catalogo{

    private ArrayList<Veiculo> carros;
    private ArrayList<Veiculo> motos;
    private ArrayList<Veiculo> caminhoes;

    public Catalogo() {
        carros = new ArrayList<Veiculo>();
        motos= new ArrayList<Veiculo>();
        caminhoes= new ArrayList<Veiculo>();
    }

    public void addCarro (Veiculo carro){
        carros.add(carro);

    }
    public void addMoto (Veiculo moto){
        motos.add(moto);

    }
    public void addCaminhao (Veiculo caminhao){
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
                ", caminhoes=" + caminhoes +
                '}';
    }
}