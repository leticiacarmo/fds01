public class App{
    public static void main(String args[])
    {
        System.out.println("\n");
        System.out.println("------------------Catálogo de Carros----------------------------------");

        Catalogo carro1 = new Catalogo();
        carro1.addCarro(new Carro("KWID","RENAULT",43000.00,4));
        Catalogo carro2 = new Catalogo();
        carro2.addCarro(new Carro("SANDERO","RENAULT",35000.00,4));
        Catalogo carro3 = new Catalogo();
        carro3.addCarro(new Carro("HB20","HYUNDAY",41000.00,4));
//        carro1.veiculo();
//        carro2.veiculo();
//        carro3.veiculo();

        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());

        System.out.println("\n");
        System.out.println("------------------Catálogo de Caminhões----------------------------------");
        Catalogo caminhao1 = new Catalogo();
        caminhao1.addCaminhao(new Caminhao("VM 260","MARCOPOLO",250000.00,16));
        Catalogo caminhao2 = new Catalogo();
        caminhao1.addCaminhao(new Caminhao("710","MERCEDES",110000.00,16));
        Catalogo caminhao3 = new Catalogo();
        caminhao1.addCaminhao(new Caminhao("FH 460","VOLVO",350000.00,16));

        System.out.println(caminhao1.toString());
        System.out.println(caminhao2.toString());
        System.out.println(caminhao3.toString());


        System.out.println("\n");
        System.out.println("------------------Catálogo de Motos----------------------------------");
        Catalogo moto1 = new Catalogo();
        moto1.addMoto(new Moto("NEO 125","YAMAHA",28000.00,2));
        Catalogo moto2 = new Catalogo();
        moto2.addMoto(new Moto("BIZ","HONDA",12000.00,2));
        Catalogo moto3 = new Catalogo();
        moto3.addMoto(new Moto("BURGMAN","SUZUKI",24000.00,2));

        System.out.println(moto1.toString());
        System.out.println(moto2.toString());
        System.out.println(moto3.toString());


    }
}