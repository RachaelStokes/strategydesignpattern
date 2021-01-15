package strategydesignpattern;

import java.util.Random;

public class QuarterBack extends Player{

    public QuarterBack(String name) {
        super(name);
    }

    public void setOffenceBehavior(){
        Random rand = new Random();
        int offence = rand.nextInt(1);
        if (offence == 0){
            this.offenceBehavior = new RunBehavior();
        }
        else if (offence == 1){
            this.offenceBehavior = new PassBehavior();
        }
    }

    public void setDefenceBehavior(){
        this.defenceBehavior = new NullBehavior();
    }
}
