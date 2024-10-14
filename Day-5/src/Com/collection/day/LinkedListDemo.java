package Com.collection.day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cart=new LinkedList<>(); //ArrayList to store the products

        //Add the items to the cart

        cart.add("Laptop");
        cart.add("HeadPhones");
        cart.add("Ipad");
        //Displaying the cart items
        System.out.println("Cart items" +cart);

        cart.removeFirst();
        System.out.println("After update:" +cart);

        cart.addFirst("Cloths");
        System.out.println("First item in the cart" +cart);


     //  List<Integer> numbrs =new ArrayList<>();
        //List<Integer> numbrs =new LinkedList<>();

        //ArrayList <Integer> numbrs =new ArrayList<>();
        //LinkedList<Integer> numbrs =new LinkedList<>();


    }
}
