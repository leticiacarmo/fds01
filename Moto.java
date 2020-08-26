public class Moto implements Veiculo {
    private String placa;
    private String marca;
    private double preco;
    private int cilindradas;
    private double combustivel;
    private final double consumoPorLitro;    
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private final int delta;

    public Moto(final String umaPlaca, final String umaMarca, final double umPreco, int cilindradas, int velocidadeAtual) {
        this.placa = umaPlaca;
        this.marca = umaMarca;
        this.preco = umPreco;
        this.cilindradas = cilindradas;
        this.combustivel = 0;
        this.consumoPorLitro = 10;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = 180;
        this.delta = 10;
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

    public double getConsumoPorLitro() {
        return consumoPorLitro;
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
        return "Moto {" + "placa: " + getPlaca() + ", marca: " + getMarca() + ", preco:" + getPreco()
                + ", cilindradas: " + getCilindradas() + ", combustivel no tanque: " + getCombustivel()
                + ", velocidade máxima: " + getVelocidadeMaxima() + "}";
    }

    @Override
    public double abastece(double litros) {
        if (litros > 0.0 && litros < 16.0){
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
        if (velocidadeAtual >= 2)
            velocidadeAtual -= 2;
        else
            velocidadeAtual = 0;
    }
}
