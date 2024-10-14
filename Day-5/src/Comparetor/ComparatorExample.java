package Comparetor;

import Com.collection.day.Product;

import javax.management.loading.PrivateClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();
        products.add(new Product("Laptop" ,123204));
        products.add(new Product("Television" ,23204));
        products.add(new Product("Mobile" ,1232));

//        Collections.sort(products,new RatingComparator());
//        System.out.println("Sorted items by rating ");
//        for(Product p:products)
//            System.out.println(p);

//        //Comparing based on
//        products.sort(products.new PriceComparator());
//        System.out.println("sorted by Price");
//        for(Product p:products)
//            System.out.println(p);


    }
}
