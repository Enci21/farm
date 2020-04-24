import plant.Almond;
import plant.Juniper;
import plant.Month;
import plant.Spruc;

public class Main {


    public static void main(String[] args) {
        Month month = new Month();
        Juniper juniper = new Juniper(month);
        Juniper juniper2 = new Juniper(month);
        Spruc spruc = new Spruc(month);
        Spruc spruc2 = new Spruc(month);
        Spruc spruc3 = new Spruc(month);
        Spruc spruc4 = new Spruc(month);
        Almond almond = new Almond();
        Almond almond2 = new Almond();
        Farm farm = new Farm.FarmBuilder().addAlmond(almond).addAlmond(almond2).addJuniper(juniper).addJuniper(juniper2).addSpruc(spruc).addSpruc(spruc2).build();
        for (int i = 0; i < 80; i++) {
            month.setMonthCounter(month.getMonthCounter() + 1);
            System.out.println("TOTAL FOOD PRODUCTION on the Farm after " + month.getMonthCounter() + " months: " + farm.countTotalFood());
        }

    }
}
