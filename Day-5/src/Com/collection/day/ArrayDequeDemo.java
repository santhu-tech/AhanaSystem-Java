package Com.collection.day;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> customerTickets=new ArrayDeque<>();

        //Add tickets
        customerTickets.add("Isuues with Payment");
        customerTickets.add("Cannot track my order");
        customerTickets.add("refund amt");

        customerTickets.addFirst("Urgent payment");
        //order the issues
        System.out.println(customerTickets.poll());
        System.out.println(customerTickets.poll());
        System.out.println(customerTickets.poll());

        //add new issues
      //  customerTickets.addFirst("Urgent payment");
        System.out.println(customerTickets.peek());



    }


}
