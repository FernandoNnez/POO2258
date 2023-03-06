package org.example;
import java.awt.*;
import java.util.Scanner;
public class Clases {
    public static void main(String[] args) {
        System.out.println("Escribe la clase a ejecutar: \ngato \napagador");
        Scanner scanner=new Scanner(System.in);
        String clase=scanner.nextLine();
        if(clase.equals("gato")) {
            //System.out.println("Clase gato Iniciada");
            System.out.println("Por favor escribe: nombre del gato, edad, raza, tamaño y peso");
            String string = scanner.nextLine();
            String[] elementos = string.split(",");
            String nombre = elementos[0];
            int edad = Integer.parseInt(elementos[1]);
            String raza = elementos[2];
            float tamanio = Float.parseFloat(elementos[3]);
            float peso = Float.parseFloat(elementos[4]);
            Gato gatito=new Gato(nombre,edad,raza,tamanio,peso);
            System.out.println(gatito.toString());
            String accion = "";
            while (true) {
                System.out.println("Ingresa una acción: respirar, comer, brincar, dormir o maullar, si quieres finalizar escribe terminar.");
                accion = scanner.nextLine();
                switch (accion) {
                    case "respirar":
                        gatito.Respirar();
                        continue;
                    case "comer":
                        gatito.Comer("Pescadito");
                        continue;
                    case "brincar":
                        gatito.Brincar();
                        continue;
                    case "dormir":
                        gatito.Dormir();
                        continue;
                    case "maullar":
                        gatito.Maullar();
                        continue;
                    case "terminar":
                        System.out.println("Gatito terminado");
                        break;
                    default:
                        System.out.println("Acción no valida");
                        continue;
                }
                break;
            }
        }
        if(clase.equals("apagador")) {
            System.out.println("Por favor escribe: tipo de apagador, color, material, número de apagadores, número de enchufes.");
            String string1 = scanner.nextLine();
            String[] atributos = string1.split(",");
            String tipo = atributos[0];
            String color = atributos[1];
            String material = atributos[2];
            byte numApagadores = Byte.parseByte(atributos[3]);
            byte numEnchufes = Byte.parseByte(atributos[4]);
            Apagador apagado=new Apagador(tipo,color,material,numApagadores,numEnchufes);
            System.out.println(apagado.toString());
            String estado = "";
            while (true) {
                System.out.println("Ingresa una acción: encender, posición, oxidado, si quieres finalizar escribe terminar.");
                estado = scanner.nextLine();
                switch (estado) {
                    case "encender":
                        apagado.Encender();
                        continue;
                    case "posición":
                        apagado.Posicion();
                        continue;
                    case "oxidado":
                        apagado.Oxidado();
                        continue;
                    case "terminar":
                        System.out.println("Apagador terminado");
                        break;
                    default:
                        System.out.println("Acción no valida");
                        continue;
                }
                break;
            }
        }
    }
}
class Gato {
    private String nombre;
    private int edad;
    private String raza;
    private float tamanio;
    private float peso;
    public Gato(String elementos, int elementos1, String elementos2, float elementos3, float elementos4) {
        this.nombre=elementos;
        if(elementos1>21){
            System.out.println("Un gato no puede vivir más de 21 años.");
        }else{
            this.edad=elementos1;
        }
        this.raza=elementos2;
        if(elementos3>36){
            System.out.println("Un gato no puede medir más de 35 cm.");
        }else{
            this.tamanio=elementos3;
        }
        if(elementos4>10){
            System.out.println("Un gato no puede pesar más de 10 kg.");
        }else{
            this.peso=elementos4;
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public float getTamanio() {
        return tamanio;
    }
    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
   public void Respirar() {
       if(Math.random()>.5){
           System.out.println(nombre+" está inhalando.");
       }else{
           System.out.println(nombre+" está exhalando.");
       }
   }
   public void Comer(String comida) {
       System.out.println(nombre+" está comiendo "+comida+", nom nom nom.");
   }
   public void Brincar() {
       System.out.println(nombre+" brincó "+Math.floor(Math.random()*10)+" metros!!!");
   }
   public void Dormir() {
       if(Math.random()>.5){
           System.out.println(nombre+" se durmió.");
       }else{
           System.out.println(nombre+" se despertó.");
       }
   }
    public void Maullar() {
        System.out.println(nombre+" dice: Miau!");
    }
    @Override
    public String toString() {
        return "Gato: " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", tamanio=" + tamanio +
                ", peso=" + peso;
    }
}
class Apagador {
    boolean estado=false;
    int contador=0;
    private String tipo;
    private String  color;
    private String material;
    private int numApagadores;
    private int numEnchufes;
    public Apagador(String elementos, String elementos1, String elementos2, int elementos3, int elementos4) {
        this.tipo=elementos;
        this.color=elementos1;
        this.material=elementos2;
        if(elementos3>3){
            System.out.println("Un apagador no puede tener más de 3 apagadores.");
        }else{
            this.numApagadores=elementos3;
        }
        if(elementos4>3){
            System.out.println("Un apagador no puede tener más de 3 enchufes.");
        }else{
            this.numEnchufes=elementos4;
        }
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public int getNumApagadores() {
        return numApagadores;
    }
    public void setNumApagadores(int numApagadores) {
        this.numApagadores = numApagadores;
    }
    public int getNumEnchufes() {
        return numEnchufes;
    }
    public void setNumEnchufes(int numEnchufes) {
        this.numEnchufes = numEnchufes;
    }
    public void Encender() {
        contador=contador+1;
        Oxidado();
        if(estado==true){
            System.out.println("El apagador de "+tipo+"se apagó.");
            estado=false;
        }else{
            System.out.println("El apagador de "+tipo+"se encendió.");
            estado=true;
        }
    }
    public void Posicion() {
        if(estado==true){
            System.out.println("Derecha");
        }else{
            System.out.println("Izquierda");
        }
    }
    public void Oxidado() {
        if(contador>5){
            System.out.println("El apagador se oxidó.");
        }
    }
    @Override
    public String toString() {
        return "Apagador: " +
                "tipo='" + tipo + '\'' +
                ", color=" + color +
                ", material='" + material + '\'' +
                ", número de apagadores=" + numApagadores +
                ", número de enchufes=" + numEnchufes;
    }
}
