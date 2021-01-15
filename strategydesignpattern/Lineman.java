package strategydesignpattern;

import java.util.Random;
    public class Lineman extends Player {

        public Lineman(String name) {
            super(name);
        }
        
        public void setOffenceBehavior() {
            this.offenceBehavior = new OBlockBehavior();
        }
    
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

