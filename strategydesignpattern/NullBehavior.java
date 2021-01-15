package strategydesignpattern;

public class NullBehavior implements DefenceBehavior{

    public String play(){
        return "not playing";
    }
}
