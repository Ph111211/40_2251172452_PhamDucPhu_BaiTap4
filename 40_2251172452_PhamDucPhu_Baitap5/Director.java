public class Director {

    
    public void makeTaxBBQ(Builder builder,double price, double tax) {
        builder.reset();
        builder.setPrice(price);
        builder.setTax_Percent(tax);


    }
    public void makeTaxNovel(Builder builder,double price, double tax) {
        builder.reset();
        builder.setPrice(price);
        builder.setTax_Percent(tax);
    }
    public void makeTaxFan(Builder builder,double price, double tax) {
        builder.reset();
        builder.setPrice(price);
        builder.setTax_Percent(tax);
    }
    
   
}
