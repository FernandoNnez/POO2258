package Excepciones2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LeerArchivo {
    public void leer(String ruta) throws IOException{
            BufferedReader reader=new BufferedReader(new FileReader(ruta));
            String linea="";
            while ((linea=reader.readLine())!=null){
                System.out.println("Source: "+linea);
            }
    }
    public void metodo1(String ruta)throws IOException{
        this.metodo2(ruta);
    }
    public void metodo2(String ruta) throws IOException{
        this.leer(ruta);
    }
}
