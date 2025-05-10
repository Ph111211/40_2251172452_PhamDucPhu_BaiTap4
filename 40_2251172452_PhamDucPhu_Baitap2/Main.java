class Main {
    public static void main(String[] args){
        TaxableItem items[] = new TaxableItem[2];
        items[0] = new Book(1200);
        items[1] = new Electronics(3000);
        TaxCalculator mt = new TaxCalculator();
        double sum = mt.CalculateTotalTax(items);
        System.out.println(sum);
    }
}