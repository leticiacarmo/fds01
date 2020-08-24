public Interface Veiculo{
    private int placa;
    private String descricao;
    private double preco;

    @Override
    public String toString() {
        return "Veiculo [placa=" + codigo + ", descricao=" + descricao + ", preço=" + preco"]";
    }
}
    