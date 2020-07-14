package src.Anti_Patterns;

class Addition{
    Addition(int a){ }
    Addition(int a,int b){ }
    Addition(int a,int b,int c,int d){ }
    Addition(int a,double b,double c,float d,int e){ }
}

class Subtraction{
    Subtraction(int a){ }
    Subtraction(int a,int b){ }
    Subtraction(int a,int b,int c,int d){ }
    Subtraction(int a,double b,double c,float d,int e){ }
}

class Pizza {
    public Pizza(int size) { }
    public Pizza(int size, boolean cheese) { }
    public Pizza(int size, boolean cheese, boolean pepperoni) { }
    public Pizza(int size, boolean cheese, boolean pepperoni, boolean bacon) { }
}

public class Telescoping_Constructor {
    public static void main(String[] args) {
        System.out.println("Above classes have telescoping constructor");
    }
}