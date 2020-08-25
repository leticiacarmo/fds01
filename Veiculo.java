public class Veiculo{
    //void veiculo();
    private String placa;
    private String marca;
    private double preco;

<<<<<<< HEAD
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

=======
>>>>>>> 8531b1163bf287e512d6d302f489c101eea6d10f
    @Override
    public String toString() {
        return "Veiculo{" +
                "placa=" + placa +
                ", descricao='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }
}
