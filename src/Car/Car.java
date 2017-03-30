package Car;

/**
 * Created by joris on 16.03.17.
 */
public class Car {
    private int size;
    private String name;
    Batterie batterie;

    public Car(int size, String name, Batterie batterie) {
        this.size = size;
        this.name = name;
        this.batterie = batterie;
    }

    public Batterie getBatterie() {
        return batterie;
    }

    public void setBatterie(Batterie batterie) {
        this.batterie = batterie;
    }

    public void drive(){
        System.out.println("Start Driving");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
