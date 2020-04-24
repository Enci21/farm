package plant;

import java.util.Random;

public class Almond extends Plant implements Rothshroomable {
    private Random random = new Random();

    public Almond() { setCropPerMonth(50); }

    public boolean isShrooming() {
        return random.nextInt(100) < 8;
    }

    public boolean isRotting() {
        System.out.println("Almond rotting!");
        return random.nextInt(100) < 13;
    }

    @Override
    public int produceFood() {
        growingMonthlyProduction();
        if (isShrooming()) {
            boostCropPerMonth(10);
        }
        if (isRotting()) {
            reduceProduction(18);
            setCropPerMonth(0);
        }
        if (getCropPerMonth() < 40){
            setCropPerMonth(getCropPerMonth()*2);
        }
        System.out.println("Almond produced " + getCropPerMonth() + " in this month!");
        return getCropPerMonth();

    }
}
