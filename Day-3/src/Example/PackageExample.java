package Example;
import Modifiers.*;

public class PackageExample extends PriModi{
    public static void main(String[] args) {
//PriModi obj=new PriModi();
        PackageExample ex=new PackageExample();
        System.out.println(ex.var);//calling public variable
         System.out.println(ex.protectedvar); //protected varaible
//       System.out.println(ex.defaultvar);
//        System.out.println(ex.privatevar);

    }
}
