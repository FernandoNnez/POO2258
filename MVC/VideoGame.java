package MVC;
public class VideoGame {
    private int id;
    private String name;
    private  String gender;
    private double sizeGB;
    private String plataform;
    public VideoGame() {
    }
    public VideoGame(int id, String name, String gender, double sizeGB, String plataform, String dev) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.sizeGB = sizeGB;
        this.plataform = plataform;
        this.dev = dev;
    }
    private String dev;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getSizeGB() {
        return sizeGB;
    }
    public void setSizeGB(double sizeGB) {
        this.sizeGB = sizeGB;
    }
    public String getPlataform() {
        return plataform;
    }
    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }
    public String getDev() {
        return dev;
    }
    public void setDev(String dev) {
        this.dev = dev;
    }
    @Override
    public String toString() {
        return "VideoJuego{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", sizeGB=" + sizeGB +
                ", plataform='" + plataform + '\'' +
                ", dev='" + dev + '\'' +
                '}';
    }
}