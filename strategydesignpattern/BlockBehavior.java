package strategydesignpattern;

/**
 * Class implementing the DefenceBehavior interface and Randomly choosing a type of block
 * @author Rachael
 */
import java.util.Random;

public class BlockBehavior implements DefenceBehavior{
    Random rand = new Random();
    private String[] blocks = {"kick", "punt", "pass", "catch"};

    /**
     * Randomly chooses a type of block from the array of blocks and prints
     * @return A String stating what is being blocked based on what is generated
     */
    public String play() {
        return "block a "+blocks[rand.nextInt(blocks.length)];
    }
}
