public class Caminhao implements Veiculo{
    private String modelo;
    private String marca;
    private double preco;
    private int rodas;

    public Caminhao(String umModelo, String umaMarca, double umPreco, int umaRoda) {
        this.modelo = umModelo;
        this.marca = umaMarca;
        this.preco = umPreco;
        this.rodas = umaRoda;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getRodas() { return rodas; }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo=" + modelo +
                ", descricao='" + marca + '\'' +
                ", preco=" + preco + ", quantidade de rodas: " + rodas;
    }

    @Override
    public void veiculo() {
        System.out.println(toString());
    }
}
