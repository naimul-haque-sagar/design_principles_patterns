package src.Creational_Patterns;

public class BuilderPattern {
    public static void main(String[] args) {

    }
}
class HouseBuilder{
    protected House house;
}

class House{
    private String garden;
    private String pool;
    private String garage;

    public void setGarden(String garden) {
        this.garden = garden;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }
}
