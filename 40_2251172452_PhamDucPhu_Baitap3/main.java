class main {
    public static void main(String[] args){
        TaxableItem items[] = new TaxableItem[2];
        TaxableItemFactory bookFactory = new BookFactory();
        TaxableItemFactory electronicsFactory = new ElectronicsFactory();
        items[0] = bookFactory.createItem(1200);
        items[1] = electronicsFactory.createItem(3000);
        TaxCalculator mt = new TaxCalculator();
        double sum = mt.CalculateTotalTax(items);
        System.out.println("Tong tien thanh toan sau thue khi mua 2 san pham la: " + sum);
    }
}