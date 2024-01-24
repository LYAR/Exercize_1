public class SilverCustomer extends Customer{

    public SilverCustomer(int id, String name) {
        super(id, name);

    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        if (fullPrice >= 500) {
            return fullPrice*0.85;
        } else {
            return fullPrice;
        }
    }
}
