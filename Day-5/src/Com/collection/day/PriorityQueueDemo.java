package Com.collection.day;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    //Based on your priority ,Insertion order is not a matter

    //LinkedList Queue -->FIFO //Customer Care

    //Array Dequeue -->Fast compare to LinkedList
    public static void main(String[] args) {
     //   PriorityQueue<Patient> patient=new PriorityQueue<Patient>();

        PriorityQueue<Integer> loanApp=new PriorityQueue<>();  //Default one -->natural ordering
        // Comparable  -->your own comaprsion between objects

        loanApp.add(5500);
        loanApp.add(4000);
        loanApp.add(170000);
        loanApp.add(2000);

        System.out.println(loanApp.poll());//poll() if your Queue is empty it will return null
        System.out.println(loanApp.poll());
        System.out.println(loanApp.poll());
        System.out.println(loanApp.poll());







    }




}
