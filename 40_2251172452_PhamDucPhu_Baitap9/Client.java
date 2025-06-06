public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        double totalTax = 0.0;
        TaxableItem book = new TaxBook(130.0);
        context.setTaxItem(book);
        double tb = context.calculate();
        System.out.println("Tax of Book: " + tb);
        totalTax += tb;
        TaxableItem food = new TaxFood(250.0);
        context.setTaxItem(food);
        double tf = context.calculate();
        System.out.println("Tax of Food: " + tf);
        totalTax += tf;

        // Tổng thuế
        System.out.println("Tong thue: " + totalTax);
    }
}
