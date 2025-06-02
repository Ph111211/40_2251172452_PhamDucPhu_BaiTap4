public class Main {
    public static void main(String[] args) {
        TaxableItem item1 = new TaxBook(150);       
        TaxableItem item2 = new TaxFood(100);        
        TaxableItem item3 = new TaxElectronics(500); 

        Calculate calc = new Calculate();

        double tax1 = calc.Calculator(item1);
        double tax2 = calc.Calculator(item2);
        double tax3 = calc.Calculator(item3);

        System.out.println("Book Tax: $" + tax1);
        System.out.println("Food Tax: $" + tax2);
        System.out.println("Electronics Tax: $" + tax3);

        double totalTax = tax1 + tax2 + tax3;
        System.out.println("Total Tax: $" + totalTax);
    }
}
