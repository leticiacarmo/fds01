public class Moto {// implements Veiculo {
    private final String placa;
    private final String marca;
    private final double preco;
    private final int cilindradas;
    private double combustivel;

    public Moto(final String umaPlaca, final String umaMarca, final double umPreco, int cilindradas) {
        this.placa = umaPlaca;
        this.marca = umaMarca;
        this.preco = umPreco;
        this.cilindradas = cilindradas;
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

    public int getCilindradas() {
        return cilindradas;
    }

    public double getCombustivel() {
        return combustivel;
    }

    @Override
    public String toString() {
        return "Moto {" + "placa: " + getPlaca() + ", marca: " + getMarca() + ", preco:" + getPreco()
                + ", cilindradas: " + getCilindradas() + ", combustivel no tanque: " + getCombustivel() + "}";
    }
}
