package strategydesignpattern;
/**
 * interface created that requires all classes that implement it create a play method
 * @author Rachae
 */
public interface DefenceBehavior {
    /**
     * method that will be used in the classes that implement this interface that print what type of play they are making
     * @return a string that explains the play that the player is making
     */
    public String play(); 
}
