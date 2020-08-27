public class Carro implements Veiculo {
    private String placa;
    private String marca;
    private double preco;
    private int quantidadePortas;
    private double combustivel;
    private final double consumoPorLitro;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private final int delta;

    public Carro(final String umaPlaca, final String umaMarca, final double umPreco, int quantidadePortas, int velocidadeAtual) {
        this.placa = umaPlaca;
        this.marca = umaMarca;
        this.preco = umPreco;
        this.quantidadePortas = quantidadePortas;
        this.combustivel = 0;
        this.consumoPorLitro = 10;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = 240;
        this.delta = 5;
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

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getDelta() {
        return delta;
    }

    @Override
    public String toString() {
        return "Carro {" + "placa: " + getPlaca() + ", marca: " + getMarca() + ", preco:" + getPreco()
                + ", quantidade de portas: " + getQuantidadePortas() + ", combustivel no tanque: " + getCombustivel()
                + ", velocidade máxima: " + getVelocidadeMaxima() + "}";
    }

    @Override
    public double abastece(double litros) {
        if (litros > 0.0 && litros < 100.0){
            combustivel += litros;
        }
        return combustivel;
    }

    @Override
    public double dirige(double distancia) {
        // Para distancias impossíveis retorna 0
        if (distancia <= 0){
            return 0.0;
        }
        // Calcula o consumo para a distancia
        double consumo = distancia / consumoPorLitro;
        // Diminui o combustivel gasto e retorna a distancia percorrida
        if (combustivel >= consumo){
            combustivel -= consumo;
            return distancia;
        } else {
            double distPossivel = combustivel * consumoPorLitro;
            combustivel = 0.0;
            return distPossivel;
        }
    }

    @Override
    public void acelerar() {
        if (velocidadeAtual + delta > velocidadeMaxima)
            velocidadeAtual += velocidadeMaxima;
        else
            velocidadeAtual += delta;
    }

    @Override
    public void frear() {
        if (velocidadeAtual >= 5)
            velocidadeAtual -= 5;
        else
            velocidadeAtual = 0;
    }
}