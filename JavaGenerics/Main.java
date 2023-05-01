package JavaGenerics;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Caja<String> miCaja=new Caja<>(new String[10]);
        miCaja.add(0,"oa");
        miCaja.add(1,"oi");
        miCaja.add(2,"ola");
        System.out.println(miCaja+"\n----------");
        CajaSinGenericos miCajaSin=new CajaSinGenericos(new Object[10]);
        miCajaSin.add(0,"oaoa");
        miCajaSin.add(1,"oioi");
        miCajaSin.add(2,"olaola");
        System.out.println(miCajaSin+"\n----------");
        String temp2=(String)miCajaSin.get(0);
        Caja<Comida>cajaComida=new Caja<>(new Comida[10]);
        cajaComida.add(0,new Comida("Chocolate",true));
        cajaComida.add(1,new Comida("Sandia",false));
        cajaComida.add(2,new Comida("ICE",true));
        System.out.println(cajaComida.get(1)+"\n----------");
        ArrayList<Comida>comidas=new ArrayList<>();
        comidas.add(new Comida("Galleta",true));
        comidas.add(new Comida("Galleta",true));
        comidas.add(new Comida("Galleta",true));
        comidas.add(new Comida("Galleta",true));
        comidas.add(new Comida("Galleta",true));
        comidas.add(new Comida("Gomita",true));
        System.out.println(comidas.size());
        System.out.println(comidas.get(5));
        ArrayList<Comida>comidas2=new ArrayList<>();
        comidas2.add(new Comida("Danonino",true));
        comidas2.add(new Comida("Danup",true));
        comidas2.add(new Comida("Helado",true));
        comidas2.add(new Comida("Yakult",true));
        comidas2.add(new Comida("Manzana",false));
        System.out.println(comidas2.get(4));
        comidas2.set(3,new Comida("Fresa",false));
        comidas2.add(0,new Comida("Naranja",false));
        System.out.println("-------FINAL------");
        for (Comida comida:comidas2) {
            System.out.println(comida);
        }
    }
}
