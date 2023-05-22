package SQLiteFUNCTIONS;
import SQLiteFUNCTIONS.Modelo.Libro;
import SQLiteFUNCTIONS.persistencia.LibroDAO;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        LibroDAO LDAO=new LibroDAO();
        Libro libro=new Libro(2,"ola","yo, quien más");
        try {
            if(LDAO.update(libro)){
                System.out.println("Uptate :)");
            }else{
                System.out.println("Uptate :(");
            }
        }catch (SQLException oa){
            System.out.println("Error Update");
        }
        //Delete
        /*
        try {
            if(LDAO.delete("1")){
                System.out.println("Delete :)");
            }else{
                System.out.println("Delete :(");
            }
        }catch (SQLException oaoaoa){
            System.out.println("Error Delete");
        }
        */
        //SearchID
        try {
            Libro res=(Libro) LDAO.searchID("2");
            System.out.println(res);
            System.out.println("---------------");
            for(Object lib:LDAO.getAll()){
                System.out.println((Libro)lib);
            }
        }catch (SQLException oa){
            oa.printStackTrace();
            System.out.println("Error SearchID or GetAll");
        }
    }
}