public class App{
    public static void main(String args[])
    {
        System.out.println("\n");
        System.out.println("------------------Catálogo de Veículos----------------------------------");

        Catalogo carro1 = new Catalogo();
        carro1.addCarro(new Veiculo("IJK","FIAT",35000.00));
//        listaVeiculos.adicionar(new Veiculo("LFG","RENAULT",42000.00));
//        listaVeiculos.adicionar(new Veiculo("HJU","FORT",38000.00));
//        listaVeiculos.adicionar(new Veiculo("VBL","TOYOTA",22000.00));

        System.out.println(carro1.toString());

    }
}