package MapDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //HashMap<Integer,Customer> cutomers=new HashMap<>();

        TreeMap<Integer,Customer> customers=new TreeMap<>();
        //Adding customers acc
        customers.put(105,new Customer("santhiya ",1200));
        customers.put(101,new Customer("Peter ",10000));
        customers.put(100,new Customer("Akshya",150000));

        System.out.println(customers);

    }


}
