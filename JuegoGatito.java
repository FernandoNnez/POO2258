import java.util.Scanner;
public class JuegoGatito {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Juego del Gato");
        String cadena=scanner.nextLine();
        if(cadena.length()>9){
            System.out.println("Solo puedes ingresar 9 caracteres tu cadena tiene "+cadena.length()+" caracteres");
            cadena=scanner.nextLine();
        } if(cadena.length()<9){ //Utilizo un anidado por que si utilizo else cuenta que tiene 9 o menos caracteres.
            System.out.println("¡No se puede jugar con menos de 9 caracteres!, tu cadena tiene "+cadena.length()+" caracteres");
            cadena=scanner.nextLine();
        }
        if(!cadena.matches("[XO_]+")){
            System.out.println("Solo puedes escribir X,O,_ vuelve a intentarlo");
            cadena=scanner.nextLine();
            if(!cadena.matches("[XO_]+")){
                System.out.println("Te dije que solo puedes escribir X,O,_ >:(");
            }
        }
        //System.out.println("Ejecución");
        if(cadena.length()==9&&cadena.matches("[XO_]+")){
            System.out.println("-----");
            for(int i=0;i<cadena.length();i+=3) {
                String renglon=cadena.substring(i,Math.min(i+3,cadena.length()));//Con Math.min no va más allá de la cadena
                System.out.println("|"+renglon+"|");
            }
            System.out.print("-----\nJuego del Gatito terminado.");
        }
    }
}
