public class LambadaExample {
    public static void main(String[] args) {
        Calculator add=(a,b)->a+b;  //Lambada Expression
        Calculator sub=(a,b) ->(a-b);
        System.out.println(add.calc(5,2)); //calling the functional interface method
        System.out.println(sub.calc(6,3));

    }
}
