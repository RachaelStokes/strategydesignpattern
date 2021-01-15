package strategydesignpattern;
/**
 * Class that creates a type of football player called a lineman
 * @author Rachael
 */
import java.util.Random;
    public class Lineman extends Player {

        /**
         * Creates a new lineman with the indicated name
         * @param name The name of the lineman
         */
        public Lineman(String name) {
            super(name);
        }
        
        /**
         * Sets the Offence behavior to an OBlock Behavior
         */
        public void setOffenceBehavior() {
            this.offenceBehavior = new OBlockBehavior();
        }
    
        /**
         * Sets the defense behavior randomly to either a block, strip, or sack behavior
         */
        public void setDefenceBehavior() {
            Random rand = new Random();
            int defence = rand.nextInt(2);
            if(defence == 0) {
                this.defenceBehavior = new BlockBehavior();
            }
            else if(defence == 1) {
                this.defenceBehavior = new StripBehavior();
            }
            else  {
                this.defenceBehavior = new SackBehavior();
            }
        }
    }

