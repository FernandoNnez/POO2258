package Excepciones2;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        LeerArchivo lectura=new LeerArchivo();
        try {
            lectura.metodo1("oa.txt");
        }catch (IOException E){
            E.printStackTrace();
        }
    }
}
