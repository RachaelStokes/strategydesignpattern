package strategydesignpattern;

public abstract class Player {
    protected String name;
    private boolean defence = false;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    
    public Player(String name) {
        this.name = name;
        setOffenceBehavior();
        setDefenceBehavior();
    }
    
    public abstract void setOffenceBehavior();

    public abstract void setDefenceBehavior();

    public String play() {
       if(defence){ 
            return this.defenceBehavior.play();

       }
       else {
            return this.offenceBehavior.play();
       }
       
    }
    
    public void turnover() {
        this.defence = !this.defence;
    }
    
}
