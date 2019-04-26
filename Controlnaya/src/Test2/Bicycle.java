package Test2;

public class Bicycle {
    private int quantspeed;
    private int colornum;
    private String name;

    public Bicycle(int quantspeed, int colornum, String name) {
        this.quantspeed = quantspeed;
        this.colornum = colornum;
        this.name = name;
    }

    public int getQuantspeed() {
        return quantspeed;
    }
    public void setQuantspeed(int quantspeed) {
        this.quantspeed = quantspeed;
    }
    public int getColornum() {
        return colornum;
    }
    public void setColornum(int colornum) {
        this.colornum = colornum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "quantspeed=" + quantspeed +
                ", colornum=" + colornum +
                ", name='" + name + '\'' +
                '}';
    }
}
