class Tax_Electronics  extends TaxableItem {
    private double Price;
    Tax_Electronics(double Price){
        this.Price = Price;
    }
    public double CalculateTax(){
        return Price * 0.1;
    }

}