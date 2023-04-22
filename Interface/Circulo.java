package Interface;
public class Circulo implements Figura{
    private double pi=3.14159265;
    private  double radio;
    public Circulo() {
    }
    public Circulo(double pi, double radio) {
        this.pi = pi;
        this.radio = radio;
    }
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public String toString() {
        return "Circulo{" +
                "pi=" + pi +
                ", radio=" + radio +
                '}';
    }
    @Override
    public double calcularArea() {
        return this.pi*this.radio*this.radio;
    }
}
