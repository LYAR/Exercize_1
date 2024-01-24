import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<ICustomer> customers = new ArrayList<>();
        customers.add(new GoldCustomer(1, "Gold Customer 1"));
        customers.add(new SilverCustomer(2, "Silver Customer 2"));
        customers.add(new Customer(3, "Customer 3"));
        customers.add(new Customer(4, "Customer 4"));
        customers.add(new SilverCustomer(5, "Silver Customer 5"));
        customers.add(new Customer(6, "Customer 6"));
        customers.add(new Customer(7, "Customer 7"));
        customers.add(new SilverCustomer(8, "Silver Customer 8"));
        customers.add(new Customer(9, "Customer 9"));
        customers.add(new GoldCustomer(10, "Gold Customer 10"));

        for (ICustomer cust : customers) {
            System.out.println(cust.getCustomerName() + " for 300 product pays " + cust.getPriceForProduct(300) + " for 3800 product pays " + cust.getPriceForProduct(3800));
        }
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

