package Com.collection.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ComparableExample {
    public static void main(String[] args) {
       // List<Product> product=new ArrayList<>();
        PriorityQueue<Product> product =new PriorityQueue<>();  //natural ordering
        product.add(new Product("Laptop",9000));
        product.add(new Product("IPhone 16",19000));
        product.add(new Product("HeadPhone",200));

      //  Collections.sort(product);   //utility class
        System.out.println("Sort by price ");
        for(Product p:product)
            System.out.println(p);


    }
}
