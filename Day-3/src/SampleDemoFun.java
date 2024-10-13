@FunctionalInterface

//Only one abstact method  -->SAM -->Single Abstract Method
//"n" number of default mthod and Static method
public interface SampleDemoFun {
    void display(); //abstract method

   // void details();
    default void details(){
        System.out.println("details method");
    }
    static void menu(){
        System.out.println("It's main menu");
    }


}
