class Electronics  extends TaxableItem {
    private double Price;
    Electronics(double Price){
        this.Price = Price;
    }
    public double CalculateTax(){
        return Price * 0.1;
    }

}