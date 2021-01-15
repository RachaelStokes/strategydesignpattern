package strategydesignpattern;

import java.util.Random;

public class RecieveBehavior implements OffenceBehavior {
    Random rand = new Random();
    private String[] receives = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
    
    public String play(){
        return "runs a "+receives[rand.nextInt(receives.length)];
    }
}
