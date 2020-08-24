public class Catalogo{
    private ArrayList<Veiculo> carro;
    private ArrayList<Veiculo> moto;
    private ArrayList<Veiculo> caminhao;

    private Catalogo() {
        carro = new ArrayList<Veiculo>;
        moto= new ArrayList<Veiculo>;
        caminhao= new ArrayList<Veiculo>;
    }

    public void addCarro (Veiculo carro){
        veiculos.add(carro);

    }
    public void addMoto (Veiculo moto){
        veiculos.add(moto);

    }
    public void addCaminhao (Veiculo caminhao){
        veiculos.add(caminhao);
    }

    public void removeCarro (Veiculo carro){
        veiculos.remove(carro);

    }public void removeMoto (Veiculo moto){
        veiculos.remove(moto);

    }public void removeCaminhao (Veiculo caminhao){
        veiculos.remove(caminhao);
    }
}