package Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joris on 16.03.17.
 */
public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(50,"bmw 300i", new Batterie(30, "Alcalin"));

        List<Car> carlist = new ArrayList<Car>();
        carlist.add(bmw);

        System.out.println("name: " +bmw.getName()+ " Size: " + bmw.getSize() + " Batterie voltage: " + bmw.getBatterie().getVoltage() );


       /* Car audi = new Car(40,"Q5",new Batterie(30, "Alcalin"));

        System.out.println("Name: "+bmw.getName());
        System.out.println("Size: " +bmw.getSize());

        System.out.println("Name: "+audi.getName());
        System.out.println("Size: " +audi.getSize());

        bmw.setName("othername");
        System.out.println("Name: "+bmw.getName());
    */
    }
}
