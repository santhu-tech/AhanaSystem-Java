package MapDemo;

public class Customer
{

    String name;
    double balace;

    public Customer(String name, double balace) {
        this.name = name;
        this.balace = balace;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", balace=" + balace +
                '}';
    }


}
