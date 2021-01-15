package strategydesignpattern;
/**
 * a class that implements that defence behavior interface that specifies a strip behavior for a player
 * @author Rachael
 */

public class StripBehavior implements DefenceBehavior{

    /**
     * method to print what the play is
     * @return a string stating that the play is to strip a ball from runners hands
     */
    public String play(){
        return "Strip a ball from runners hands";
    }
}
