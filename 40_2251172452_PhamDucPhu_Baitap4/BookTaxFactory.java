public class BookTaxFactory implements TaxableItemFactory {
    @Override
    public TaxableItem createItem(double price) {
        return new Tax_Book(price);
    }
}