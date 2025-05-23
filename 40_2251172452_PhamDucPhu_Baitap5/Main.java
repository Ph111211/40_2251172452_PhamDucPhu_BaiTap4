import java.util.*;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Tax_Book_Builder bookBuilder = new Tax_Book_Builder();
        Tax_Electronics_Builder electronicsBuilder = new Tax_Electronics_Builder();
        Tax_Food_Builder foodBuilder = new Tax_Food_Builder();
        director.makeTaxBBQ(foodBuilder, 100, 0.28);
        director.makeTaxNovel(bookBuilder, 200, 0.15);
        director.makeTaxFan(electronicsBuilder, 300, 0.5);
       

        List<TaxableItem> items = new ArrayList<>();
        items.add(bookBuilder.getResult());
        items.add(electronicsBuilder.getResult());
        items.add(foodBuilder.getResult());

        TaxCalculator calculator = new TaxCalculator();
        double totalTax = calculator.calculateTotalTax(items);
        

        System.out.println("Total Tax: " + totalTax);
    }
}
