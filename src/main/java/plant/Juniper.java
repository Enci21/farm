package plant;

public class Juniper extends Evergreen{

    public Juniper(Month month) {
        super(month);
    }

    @Override
    public int produceFood() {
        if (getCropPerMonth() >= 70){
            setCropPerMonth(70);
            sayWeenImFull();
        }else {
            growingMonthlyProduction();
            boostCropPerMonth(14);
            growLeavesMonthly();
        }
        System.out.println("Juniper produced    " + getCropPerMonth() + " in this month!");
        return getCropPerMonth();

    }
}
