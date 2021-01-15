package strategydesignpattern;

/**
 * class that implements the defence behavior interface and makes a null behavior
 * @author Rachael
 */
public class NullBehavior implements DefenceBehavior{

    /**
     * method to print what the play is for this type of behavior
     * @return a String to state that the player is not playing
     */
    public String play(){
        return "not playing";
    }
}
