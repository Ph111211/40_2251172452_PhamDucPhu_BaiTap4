class Book  extends TaxableItem {
    private double Price;
    Book(double Price){
        this.Price = Price;
    }
    public double CalculateTax(){
        return Price * 0.05;
    }

}