package Excepciones;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            int a=10;
            int b=Integer.parseInt(scanner.nextLine());
            System.out.println("La div es: "+a/b);
        } catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println("No puedes divivir algo entre 0!");
        } catch (NumberFormatException nfe){
            System.out.println("Las letras no son números...");
        } finally {
            System.out.println("Finally siempre se ejecuta.");
        }
        System.out.println("Fin.");
    }
}