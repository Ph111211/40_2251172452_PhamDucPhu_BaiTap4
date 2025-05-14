public class ElectronicsTaxFactory extends TaxableItemFactory {
    @Override
    public TaxableItem createItem(double price) {
        return new Electronics(price);
    }
}
