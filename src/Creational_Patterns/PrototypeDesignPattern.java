package src.Creational_Patterns;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDesignPattern {

    public static void main(String[] args) {
        Garage g=new Garage();
        g.garageName="don't know";
        g.show();
        System.out.println(g);
    }
}

class Garage {

    String garageName;
    List<Car> list = new ArrayList<Car>();

    public String getGarageName() {
        return garageName;
    }

    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }

    public void show() {
        Car c = new Car();
        c.carId = 1;
        c.carname = "maruti";
        Car c1 = new Car();
        c1.carId = 12;
        c1.carname = "maruti12";
        Car c2 = new Car();
        c2.carId = 11;
        c2.carname = "maruti11";

        getList().add(c);
        getList().add(c1);
        getList().add(c2);
    }

    @Override
    public String toString() {
        return "Garage{" + "garageName=" + garageName + ", list=" + list + '}';
    }

}

class Car {

    int carId;
    String carname;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    @Override
    public String toString() {
        return "car{" + "carId=" + carId + ", carname=" + carname + '}';
    }

}
