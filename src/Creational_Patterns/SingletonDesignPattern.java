package src.Creational_Patterns;

public class SingletonDesignPattern {
    public static void main(String[] args) {
       One.getInstanceOfOne();
       One.getInstanceOfOne();
    }
}
class One{
    static One one;
    
    private One(){
        
    }
    public static One getInstanceOfOne(){ 
        if(one==null){
            one=new One();
           fromOne();
        }
        
        return one;
    }  
    public static void fromOne(){
        System.out.println("I am from method");
    }
}