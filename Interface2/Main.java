package Interface2;

public class Main {
    public static void main(String[] args) {
        Camion camion=new Camion("Diesel",50);
        Moto moto=new Moto(150,"Mortalika");
        System.out.println(camion);
        System.out.println(camion.encender());;
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar()+"\n---------Moto--------");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballitos();
        moto.frenar();
        moto.apagar();

    }
}
