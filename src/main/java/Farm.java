import plant.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Farm {

    private List<Plant> plants = new ArrayList();
    private Month month = new Month();
    private Random random = new Random();

    private Farm(Month month, List<Plant> plants) {
        this.month = month;
    }

    public static class FarmBuilder {

        private List<Plant> plants = new ArrayList();
        private Month month = new Month();
        private int sprucCounter;
        private int juniperCounter;
        private int almondCounter;


        public FarmBuilder addSpruc(Spruc spruc) {
            plants.add(spruc);
            sprucCounter++;
            return this;
        }

        public FarmBuilder addJuniper(Juniper juniper) {
            plants.add(juniper);
            juniperCounter++;
            return this;
        }

        public FarmBuilder addAlmond(Almond almond) {
            plants.add(almond);
            almondCounter++;
            return this;
        }

        public Farm build() throws RuntimeException {
            if (juniperCounter >= 2 && almondCounter >= 2 && sprucCounter >= 2) {
                return new Farm(month, plants);
            }
            throw new RuntimeException("At least 2 of every plant type needed!");
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
