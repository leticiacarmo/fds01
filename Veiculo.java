public class Veiculo{
    //void veiculo();
    private String placa;
    private String marca;
    private double preco;

    public Veiculo(String umaPlaca, String umaMarca, double umPreco) {
        this.placa = umaPlaca;
        this.marca = umaMarca;
        this.preco = umPreco;
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

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa=" + placa +
                ", descricao='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }
}
