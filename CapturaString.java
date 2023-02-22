package org.example;

import java.util.Scanner;
public class CapturaString {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Por favor escribe tu nombre, profesión y nacionalidad: ");
        String string = escaner.nextLine();
        String[] elementos = string.split(" ");
        String nombre = elementos[0];
        String profesion = elementos[1];
        String nacionalidad = elementos[2];
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu profesión es: " + profesion);
        System.out.println("Tu nacionalidad es: " + nacionalidad);
    }
}
