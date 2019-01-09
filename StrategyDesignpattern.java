
public class StrategyDesignpattern {
    public static void main(String[] args) {
        //now they will get their behaviour
        
        Fight f=new KungFu();
        Fight ff=new MartialArt();
        
        HollywoodActor ha=new BruceLee(f);
        //here bruce lee will get his own behaviour like he know kungfu.......
        
        ha.sing();
        ha.dance();
        ha.fightStyle();
        
        //now you will see the output ...he got his behaviour
        
    }
}
class HollywoodActor{
    
    Fight fight;

    public HollywoodActor(Fight fight) {
        this.fight = fight;
    }
    
    
    public void sing(){
        System.out.println("He can Sing");
    }
    public void dance(){
        System.out.println("He can dance");
    }
    
    public void fightStyle(){
        fight.fight();
    }

    public Fight getFight() {
        return fight;
    }

    public void setFight(Fight fight) {
        this.fight = fight;
    }
    
    
}


interface Fight{
    public void fight();
}

class KungFu implements Fight{

    @Override
    public void fight() {
        System.out.println("He know KungFu");
    }
    
}

class MartialArt implements Fight{

    @Override
    public void fight() {
        System.out.println("He knows Martial Art");
    }
    
}

class BruceLee extends HollywoodActor{
    
    public BruceLee(Fight fight) {
        super(fight);
    }
    public void display(){
        System.out.println("Printing from Bruce lee");
    }
}

class Rock extends HollywoodActor{
    
    public Rock(Fight fight) {
        super(fight);
    }
    public void display(){
        System.out.println("Printing from Rock");
    }
}
