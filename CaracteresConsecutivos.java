import java.util.Scanner;
public class CaracteresConsecutivos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena=scanner.nextLine();
        boolean consecutiva=esSecuenciaConsecutiva(cadena);
        System.out.println(consecutiva);
    }
    public static boolean esSecuenciaConsecutiva(String cadena) {
        int finaal=cadena.charAt(0);
        for (int i=1;i<cadena.length();i++) {
            int inicial=cadena.charAt(i);
            if (inicial !=finaal+1) {
                return false;
            }
            finaal=inicial;
        }
        return true;
    }
}
