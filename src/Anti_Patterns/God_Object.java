package src.Anti_Patterns;

class Employee{
    void makeTea(){}
    void cleanRoom(){}
    void cleanDesk(){}
    void doCode(){}
    void doBugFix(){}
    void doTesting(){}
    void doManagement(){}
    void makeLunch(){}
    void closeOffice(){}
}

public class God_Object {
    public static void main(String[] args) {
        System.out.println("Above class Employee does a lot of things " +
                "that doesn't make any sense" +
                "one class or one object should have one responsibility");
    }
}
