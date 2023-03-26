package MaquinaCafe;
public class Maquina {
    private int vasos;
    private int depAgua;
    private int depCafe;
    private int depCrema;
    private int capVasos;
    private boolean cafeListo;
    public Maquina() {
        this.vasos = 50;//50 unidades
        this.depAgua = 5000;//ml
        this.depCafe = 1000;//g
        this.depCrema = 1500;//ml
        this.capVasos = 200;//ml
        this.cafeListo = false;
    }
    public int getVasos() {
        return vasos;
    }
    public void setVasos(int vasos) {
        this.vasos = vasos;
    }
    public int getDepAgua() {
        return depAgua;
    }
    public void setDepAgua(int depAgua) {
        this.depAgua = depAgua;
    }
    public int getDepCafe() {
        return depCafe;
    }
    public void setDepCafe(int depCafe) {
        this.depCafe = depCafe;
    }
    public int getDepCrema() {
        return depCrema;
    }
    public void setDepCrema(int depCrema) {
        this.depCrema = depCrema;
    }
    public int getCapVasos() {
        return capVasos;
    }
    public void setCapVasos(int capVasos) {
        this.capVasos = capVasos;
    }
    public void setcafeListo(boolean cafeListo) {
        this.cafeListo = cafeListo;
    }
    public boolean getcafeListo() {
        return cafeListo;
    }
    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public void prepararCafe(String tipo) {
        if (tipo == "1") {
            if (!cafeListo) {
                if(this.depAgua>=180&&this.depCafe>=15&&this.vasos>0){
                    System.out.println("Preparando... espera por favor");
                    esperar(3);
                    System.out.println("Americano listo.");
                    this.setDepAgua(this.depAgua-=180);
                    this.setDepCafe(this.depCafe-=15);
                    this.setVasos(this.vasos--);
                    this.setcafeListo(true);
                }else{
                    System.out.println("Insumos insuficientes, no se puede hacer café.");
                    mostrarRecursos();
                }
            } else {
                System.out.println("No se puede preparar por que ya hay un café preparado, tienes que tomártelo.");
            }
        }
        if (tipo == "2") {
            if (!cafeListo) {
                if(this.depAgua>=180&&this.depCafe>=15&&this.vasos>0){
                    System.out.println("Preparando... espera por favor");
                    esperar(3);
                    System.out.println("Expreso listo.");
                    this.setDepAgua(this.depAgua-=120);
                    this.setDepCafe(this.depCafe-=20);
                    this.setVasos(this.vasos--);
                    this.setcafeListo(true);
                }else{
                    System.out.println("Insumos insuficientes, no se puede hacer café.");
                    mostrarRecursos();
                }
            } else {
                System.out.println("No se puede preparar por que ya hay un café preparado, tienes que tomártelo.");
            }
        }
        if (tipo == "3") {
            if (!cafeListo) {
                if(this.depAgua>=180&&this.depCafe>=15&&this.depCrema>=15&&this.vasos>0){
                    System.out.println("Preparando... espera por favor");
                    esperar(3);
                    System.out.println("Capuchino listo.");
                    this.setDepAgua(this.depAgua-=100);
                    this.setDepCrema(this.depCrema-=70);
                    this.setDepCafe(this.depCafe-=14);
                    this.setVasos(this.vasos--);
                    this.setcafeListo(true);
                }else{
                    System.out.println("Insumos insuficientes, no se puede hacer café.");
                    mostrarRecursos();
                }
            } else {
                System.out.println("No se puede preparar por que ya hay un café preparado, tienes que tomártelo.");
            }
        }
    }
    public void tomarCafe() {
        if (this.cafeListo) {
            this.cafeListo = false;
            System.out.println("Tomaste un café.");
        } else {
            System.out.println("No hay ningún cafe preparado");
        }
    }
    public void mostrarRecursos() {
        System.out.println("Recursos actuales:");
        System.out.println("Agua: " + this.depAgua + " ml");
        System.out.println("Café: " + this.depCafe + " g");
        System.out.println("Crema: " + this.depCrema + " ml");
        System.out.println("Vasos: " + this.vasos);
    }
}