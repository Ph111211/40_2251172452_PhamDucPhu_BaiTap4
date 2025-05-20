public class FoodTaxFactory implements TaxableItemFactory {
    @Override
    public TaxableItem createItem(double price) {
        return new Tax_Food(price);
    }
}