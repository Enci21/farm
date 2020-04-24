import plant.Month;

public class Main {


    public static void main(String[] args) {
        Month month = new Month();
        Farm farm = new Farm(month);
        farm.createPlants();
        for (int i=0 ; i < 80; i++){
            month.setMonthCounter(month.getMonthCounter()+1);
            System.out.println("TOTAL FOOD PRODUCTION on the Farm after " + month.getMonthCounter() +" months: " + farm.countTotalFood());
        }

    }
}
