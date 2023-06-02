package SwingAppFinal.Model;
public class Mod {
    private int ID;
    private String name;
    private String hostile;
    private String gender;
    private String livingPlace;
    private String URL;
    public Mod() {
    }
    public Mod(int id,String name,String hostile,String gender,String livingPlace,String URL) {
        this.ID = id;
        this.name = name;
        this.hostile = hostile;
        this.gender = gender;
        this.livingPlace = livingPlace;
        this.URL = URL;
    }
    public int getID() {
        return ID;
    }
    public void setID(int id) {
        this.ID = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHostile() {
        return hostile;
    }
    public void setHostile(String hostile) {
        this.hostile = hostile;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getLivingPlace() {
        return livingPlace;
    }
    public void setLivingPlace(String livingPlace) {
        this.livingPlace = livingPlace;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String URL) {
        this.URL = URL;
    }
    @Override
    public String toString() {
        return "Mod{" +
                "id=" + ID +
                ", name='" + name + '\'' +
                ", hostile='" + hostile + '\'' +
                ", gender='" + gender + '\'' +
                ", livingPlace='" + livingPlace + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }

}