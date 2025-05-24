import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tax_Book tb = new Tax_Book(10,0.1);
        Tax_Food tf = new Tax_Food(100,0.2);
        Tax_Electronics tE = new Tax_Electronics(500,0.5);
        Tax_Electronics tE1 = new Tax_Electronics(510,0.5);
        CalTaxBook tbCal = new CalTaxBook(tb);
        CalTaxFood tfCal = new CalTaxFood(tf);
        CalTaxElectronics tECal = new CalTaxElectronics(tE);
        CalTaxElectronics tECal1 = new CalTaxElectronics(tE1);


        List<ITaxCal> items = new ArrayList<>();
        items.add(tbCal);
        items.add(tfCal);
        items.add(tECal);
        items.add(tECal1);

        TaxCalculator calculator = new TaxCalculator();
        double totalTax = calculator.calculateTotalTax(items);
        

        System.out.println("Total Tax: " + totalTax);
    }
}
