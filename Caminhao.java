public class Caminhao implements Veiculo {
    private final String placa;
    private final String marca;
    private final double preco;
    private final int quantidadeRodas;
    private double combustivel;

    public Caminhao(final String umaPlaca, final String umaMarca, final double umPreco, int quantidadeRodas) {
        this.placa = umaPlaca;
        this.marca = umaMarca;
        this.preco = umPreco;
        this.quantidadeRodas = quantidadeRodas;
        combustivel = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public double getCombustivel() {
        return combustivel;
    }

    @Override
    public String toString() {
        return "Caminhão {" + "placa: " + getPlaca() + ", marca: " + getMarca() + ", preco:" + getPreco()
                + ", quantidade de portas: " + getQuantidadeRodas() + ", combustivel no tanque: " + getCombustivel()
                + "}";
    }

    @Override
    public double abastece(double litros) {
        return 0;
    }

    @Override
    public double dirige(double distancia) {
        return 0;
    }

    @Override
    public void ligarTurbo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void desligarTurbo() {
        // TODO Auto-generated method stub
        
    }
}
