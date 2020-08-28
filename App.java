public class App {
    public static void main(String args[]) {
        System.out.println("\n");
        System.out.println("------------------Catálogo de Carros----------------------------------");

        Catalogo lista = new Catalogo();

        Carro c1;
        Carro c2;
        Carro c3;

        c1 = new Carro("ABC-FF", "Renault", 43000.00, 4, 40);
        c2 = new Carro("kHL-FE", "Ford", 35000.00, 4, 60);
        c3 = new Carro("VDI-HR", "Hyunday", 41000.00, 4, 50);

        lista.addCarro(c1);
        lista.addCarro(c2);
        lista.addCarro(c3);

        c1.abastece(100);
        c1.acelerar();
        c1.dirige(90);
        c1.frear();

        c2.abastece(70);
        c2.acelerar();
        c2.dirige(30);
        c2.frear();

        c3.abastece(90);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println("\n");
        System.out.println("------------------Catálogo de Caminhões----------------------------------");

        Caminhao caminhao1;
        Caminhao caminhao2;
        Caminhao caminhao3;


        caminhao1 = new Caminhao("VML-260", "MARCOPOLO", 250000.00, 16, 110);
        caminhao2 = new Caminhao("JKO-710", "MERCEDES", 110000.00, 8, 90);
        caminhao3 = new Caminhao("ISO-834", "VOLVO", 115000.00, 8, 80);


        lista.addCaminhao(caminhao1);
        lista.addCaminhao(caminhao2);
        lista.addCaminhao(caminhao3);


        caminhao1.abastece(300);
        caminhao1.acelerar();
        caminhao1.dirige(140);
        caminhao1.acelerar();
        caminhao1.frear();

        caminhao2.abastece(97);
        caminhao2.dirige(70);

        caminhao3.abastece(110);
        caminhao3.dirige(35);

        System.out.println(caminhao1.toString());
        System.out.println(caminhao2.toString());
        System.out.println(caminhao3.toString());

        System.out.println("\n");
        System.out.println("------------------Catálogo de Motos----------------------------------");

        Moto moto1;
        Moto moto2;
        Moto moto3;
        moto1 = new Moto("JBK-234", "YAMAHA", 28000.00, 150, 70);
        moto2 = new Moto("HRC-123", "HONDA", 12000.00, 125, 90);
        moto3 = new Moto("BMN", "SUZUKI", 24000.00, 250, 150);

        lista.addMoto(moto1);
        lista.addMoto(moto2);
        lista.addMoto(moto3);

        moto1.abastece(45);
        moto1.acelerar();
        moto1.dirige(30);
        moto1.frear();

        moto2.abastece(50);
        moto3.abastece(70);

        System.out.println(moto1.toString());
        System.out.println(moto2.toString());
        System.out.println(moto3.toString());
        
    }
}