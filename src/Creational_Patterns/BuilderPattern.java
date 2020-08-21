package src.Creational_Patterns;

class House{
    private boolean garden;
    private boolean pool;
    private boolean garage;

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "garden=" + garden +
                ", pool=" + pool +
                ", garage=" + garage +
                '}';
    }
}

abstract class HouseBuilder{
    protected House house;

    public House getHouse(){
        return house;
    }

    public void createHouse(){
        house=new House();
    }

    public abstract void buildGarden();
    public abstract void buildPool();
    public abstract void buildGarage();
}

class CheapHouse extends HouseBuilder{

    @Override
    public void buildGarden() {
        house.setGarden(true);
    }

    @Override
    public void buildPool() {
        house.setPool(false);
    }

    @Override
    public void buildGarage() {
        house.setGarage(false);
    }
}

class ExpensiveHouse extends HouseBuilder{

    @Override
    public void buildGarden() {
        house.setGarden(true);
    }

    @Override
    public void buildPool() {
        house.setPool(true);
    }

    @Override
    public void buildGarage() {
        house.setGarage(true);
    }
}

class HouseBuilderCompany{
    HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    public House getHouse(){
        return houseBuilder.getHouse();
    }

    public void buildHouse(){
        houseBuilder.createHouse();
        houseBuilder.buildGarage();
        houseBuilder.buildGarden();
        houseBuilder.buildPool();
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        HouseBuilderCompany houseBuilderCompany=new HouseBuilderCompany();
        HouseBuilder houseBuilder=new CheapHouse();
        HouseBuilder houseBuilder1=new ExpensiveHouse();

        houseBuilderCompany.setHouseBuilder(houseBuilder);
        houseBuilderCompany.buildHouse();

        House house=houseBuilderCompany.getHouse();
        System.out.println(house);
    }
}