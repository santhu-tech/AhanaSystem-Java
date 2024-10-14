package Com.collection.day;

import java.util.ArrayList;

public class ListDemo {

    // List -->Odered collection,Duplicates Allowed
    //Implements via ArrayList ,LinkedList
    //ArrayList -->Random access

    //LinkedList
    public static void main(String[] args) {
        ArrayList<String> cart=new ArrayList<>();  //ArrayList to store the products

        //Add the items to the cart

        cart.add("Laptop");
        cart.add("HeadPhones");
        cart.add("Ipad");
        //Displaying the cart items
        System.out.println("Cart items" +cart);

        cart.remove("Ipad");
        System.out.println("After update:" +cart);

        String product=cart.get(0);
        System.out.println("First item in the cart" +product);


    }


}
