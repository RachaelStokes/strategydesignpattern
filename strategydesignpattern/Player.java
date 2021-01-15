package strategydesignpattern;

public abstract class Player {
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    
    public Player(String name) {
        this.name = name;
    }
    
    public abstract void setOffenceBehavior();

    public abstract void setDefenceBehavior();

    public String play() {
       if(defence){
            return defenceBehavior.play();
       }
       else {
            return offenceBehavior.play();
       }
    }
    
    public void turnover() {
        if(defence) {
            defence = false;
        }
        else {
            defence = true;
        }
    }
    
}
