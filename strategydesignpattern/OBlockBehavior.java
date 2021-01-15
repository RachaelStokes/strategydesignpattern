package strategydesignpattern;

/**
 * class that implements offenceBehavior interface and makes an OBlock behavior type
 * @author Rachael
 */
public class OBlockBehavior implements OffenceBehavior{
    /**
     * @return 
     */
    public String play(){
        return "block defenders";
    }
}
