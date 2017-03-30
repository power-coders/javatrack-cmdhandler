package Car;

/**
 * Created by joris on 16.03.17.
 */
public class Batterie {

    int voltage;
    String name;

    public Batterie(int voltage, String name) {
        this.voltage = voltage;
        this.name = name;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
