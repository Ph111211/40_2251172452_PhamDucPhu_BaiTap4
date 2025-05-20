import java.util.*;

public class Main {
    public static void main(String[] args) {
        TaxableItemFactory bookFactory = new BookTaxFactory();
        TaxableItemFactory electronicsFactory = new ElectronicsTaxFactory();
        TaxableItemFactory foodFactory = new FoodTaxFactory();

        List<TaxableItem> items = new ArrayList<>();
        items.add(bookFactory.createItem(100));
        items.add(electronicsFactory.createItem(200));
        items.add(foodFactory.createItem(150));

        TaxCalculator calculator = new TaxCalculator();
        double totalTax = calculator.calculateTotalTax(items);

        System.out.println("Total Tax: " + totalTax);
    }
}
