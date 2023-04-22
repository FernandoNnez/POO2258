package Interface;

import Interface.HerenciaMultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
       Cuadrado cuadrado=new Cuadrado();
       cuadrado.setLado(5);
       System.out.println("Area de cuadrado= "+cuadrado.calcularArea());

        Circulo circulo=new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area de círculo= "+circulo.calcularArea());
        AlumnoDeportistaArtista ADA=new AlumnoDeportistaArtista();
        ADA.setNombre("Fernando");
        ADA.setArte("Pintura");
        ADA.setDeporte("Basket Ball");
        ADA.ensayar("Oleo");
        ADA.entrenar();
        ADA.presentarCompetencia("FESA");
    }
}