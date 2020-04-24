package plant;

public abstract class Plant {

    private int cropPerMonth;

    public void growingMonthlyProduction(){
        cropPerMonth =+ 4;
    }

    public void boostCropPerMonth(int boost) {cropPerMonth += boost;}

    public void reduceProduction(int reduce) {
        setCropPerMonth(getCropPerMonth() - reduce);
    }

    public abstract int produceFood();

    public int getCropPerMonth() {
        return cropPerMonth;
    }

    public void setCropPerMonth(int cropPerMonth) {
        this.cropPerMonth = cropPerMonth;
    }
}
