package plant;

import java.util.Random;

public class Spruc extends Evergreen implements Rothshroomable {

    private Random random = new Random();

    public Spruc(Month month) {
        super(month);
    }

    public boolean isShrooming() {
        return random.nextInt(100) < 5;
    }

    public boolean isRotting() {
        System.out.println("Spruc rotting!");
        return random.nextInt(100) < 4;
    }

    @Override
    public int produceFood() {
        boostCropPerMonth(26);
        growingMonthlyProduction();
        growLeavesMonthly();

        if (isShrooming()) {
            boostCropPerMonth(15);
        }
        if (isRotting()) {
            reduceProduction(20);
            setCropPerMonth(0);
        }
        System.out.println("Spurc produced  " + getCropPerMonth() + " in this month!");

        return getCropPerMonth();
    }
}
