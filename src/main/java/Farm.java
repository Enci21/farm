import plant.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Farm {

    private List<Plant> plants = new ArrayList<Plant>();
    private Month month;
    private Random random = new Random();

    public Farm(Month month) {
        this.month = month;
    }

    public void createPlants() {
        if (random.nextInt(100) < 33) {
            Almond almond = new Almond();
            plants.add(almond);
        }
        if (random.nextInt(100) < 66) {
            Juniper juniper = new Juniper(month);
            plants.add(juniper);
        }
        else {
            Spruc spruc = new Spruc(month);
            plants.add(spruc);
        }
        if(plants.size() < 9){
            createPlants();
        }
    }

    public int countTotalFood() {
         int totalFoodProduced = 0;
        for (Plant p : plants){
            int production = p.produceFood();
            totalFoodProduced += production;
        }
        return totalFoodProduced;
    }

}
