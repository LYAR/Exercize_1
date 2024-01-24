public class Customer implements ICustomer{
    protected String Name;
    protected int Id;

    public Customer(int id, String name) {
        this.Name = name;
        this.Id = id;
    }

    public String getCustomerName() {
        return Name;
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice;
    }
}
