package Modifiers;

public class PriModi {
    public int var=1; //public variable  -->anywhere youi can access it
    protected int protectedvar=2; //protected  -->same class with subclass even different packages
    int defaultvar=3; //default  -->default you can access it in the same packeages
    private int privatevar=4; //private  -->only within the class

    public void disply(){
        System.out.println("public" +var);
        System.out.println("protected" +protectedvar);
        System.out.println("default" +defaultvar);
        System.out.println("private" +privatevar);

    }

}
