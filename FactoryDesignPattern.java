
public class FactoryDesignPattern {
    public static void main(String[] args) {
        VehicleCostCalculator vehicleCostCalculator =new VehicleCostCalculator();
        Vehicle v=vehicleCostCalculator.getVehicleCost("bus");
        v.getOilCost();
        v.getTotalCost(5);
        
        Vehicle v1=vehicleCostCalculator.getVehicleCost("truck");
        v1.getOilCost();
        v1.getTotalCost(5);
        
        Vehicle v2=vehicleCostCalculator.getVehicleCost("honda");
        v2.getOilCost();
        v2.getTotalCost(5);
        
    }
  
}
abstract class Vehicle{
    int OilCost;
    abstract void getOilCost();
    
    public void getTotalCost(int distance){
        System.out.println("Oil cost for the journey "+distance*OilCost+" taka");
    }   
}
class Bus extends Vehicle{

    @Override
    void getOilCost() {
        OilCost=400;
    }
}
class Truck extends Vehicle{

    @Override
    void getOilCost() {
        OilCost=500;
    }
    
}
class Honda extends Vehicle{

    @Override
    void getOilCost() {
       OilCost=120;
    }
    
}
class VehicleCostCalculator{
    public Vehicle getVehicleCost(String vehicleName){
        if(vehicleName==null){
            return null;
        }
        if(vehicleName.equalsIgnoreCase("Bus")){
            return new Bus();
        }else if(vehicleName.equalsIgnoreCase("Truck")){
            return new Truck();
        }else if(vehicleName.equalsIgnoreCase("Honda")){
            return new Honda();
        }
        
        return null;
    }
}