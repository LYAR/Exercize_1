public abstract class BaseCustomer implements ICustomer{
    protected String Name;
    protected int Id;

    public BaseCustomer(int id, String name) {
        this.Name = name;
        this.Id = id;
    }
    @Override
    public String getCustomerName() {
        return Name;
    }
}
