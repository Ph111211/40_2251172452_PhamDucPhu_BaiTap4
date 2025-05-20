public class ElectronicsTaxFactory implements TaxableItemFactory {
    @Override
    public TaxableItem createItem(double price) {
        return new Tax_Electronics(price);
    }
}