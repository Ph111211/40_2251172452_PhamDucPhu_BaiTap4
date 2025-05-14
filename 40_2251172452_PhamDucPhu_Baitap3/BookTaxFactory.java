public class BookTaxFactory extends TaxableItemFactory {
    @Override
    public TaxableItem createItem(double price) {
        return new Book(price);
    }
}
