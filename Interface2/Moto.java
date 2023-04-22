package Interface2;

public class Moto implements Vehiculo{
    private int centimetrosCubicos;
    private String marca;
    public Moto(int centimetrosCubicos, String marca) {
        this.centimetrosCubicos = centimetrosCubicos;
        this.marca = marca;
    }
    public Moto() {
    }
    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }
    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Moto{" +
                "centimetrosCubicos=" + centimetrosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    @Override
    public boolean encender() {
        System.out.println("Encendiendo la moto marca "+getMarca());
        return true;
    }
    @Override
    public boolean apagar() {
        System.out.println("Apagando moto...");
        return true;
    }
    @Override
    public void avanzar() {
        System.out.println("Avanzando con la moto de "+getCentimetrosCubicos()+" cc.");
    }
    @Override
    public void frenar() {
        System.out.println("Frenando la moto...");
    }
    public void hacerCaballitos(){
        System.out.println("Haciendo un caballito...");
    }
}
