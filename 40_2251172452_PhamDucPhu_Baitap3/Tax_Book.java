class Tax_Book  extends TaxableItem {
    private double Price;
    Tax_Book(double Price){
        this.Price = Price;
    }
    public double CalculateTax(){
        return Price * 0.05;
    }

}