package strategydesignpattern;

public class Receiver extends Player{

    public Receiver(String name) {
        super(name);
    }
    
    public void setOffenceBehavior() {
        this.offenceBehavior = new RecieveBehavior();
    }

    public void setDefenceBehavior() {
        this.defenceBehavior = null;
    }
}
