package MaquinaCafe;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner escaner=new Scanner(System.in);
        String accion="";
        Maquina maquina=new Maquina();
        while(true){
            System.out.println("Por favor ingresa el cafe que desees, CUANDO lo PREPARES TIENES que TOMARTELO, el menu es:\n1. Americano.\n2. Expreso.\n3. Capuchino.\nPara tomar café escribe tomar, escribe limpiar para limpiar la máquina, escribe recursos para mostrar los recursos y para apagar la maquina escribe apagar.");
            accion=escaner.nextLine();
            switch(accion){
                case "1":
                    maquina.prepararCafe("1");
                    System.out.println(maquina);
                    continue;
                case "2":
                    maquina.prepararCafe("2");
                    continue;
                case "3":
                    maquina.prepararCafe("3");
                    continue;
                case "tomar":
                    maquina.tomarCafe();
                    continue;
                case "limpiar":
                    System.out.println("Limpiando... espera por favor");
                    maquina.esperar((int) Math.floor(Math.random()*10));
                    System.out.println("La máquina se ha limpiado.");
                    continue;
                case "recursos":
                    maquina.mostrarRecursos();
                    continue;
                case "apagar":
                    System.out.println("Apagando...");
                    maquina.esperar(3);
                    System.out.println("Maquina apagada.");
                    break;
                default:
                    System.out.println("Acción no valida.");
                    continue;
            }
            break;
        }
    }
}