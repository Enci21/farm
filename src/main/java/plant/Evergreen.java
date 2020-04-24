package plant;

public abstract class Evergreen extends Plant {

    private boolean rotten;
    private boolean shrooming;
    private Month month;

    public Evergreen(Month month) {
        this.month = month;
    }

    public void growLeavesMonthly() {
        if (month.getMonthCounter() % 5 == 0){
            boostCropPerMonth(8);
        }

    }

    @Override
    public void boostCropPerMonth(int boost) {
        if (getCropPerMonth() + boost >= 70) {
            setCropPerMonth(70);
            sayWeenImFull();
        } else {
            super.boostCropPerMonth(boost);
        }
    }


    public void sayWeenImFull() {
        if (getCropPerMonth() == 70) {
            System.out.println(this.getClass().getSimpleName() + "full of production!");
        }
    }

}
