import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.List;

public class GenericsDemo{
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<>();
        values.add(1);
     //   values.add(Integer.valueOf("santhiya"));
        System.out.println(values);

        List<String> names=new ArrayList<>();
        names.add("Sandy");
        names.add("Kalai");
        names.add("akshay");
        System.out.println(names);


    }
    //int a="10";

    //Defining array list
    //defining LinkedListed



    //Generics you can define classes,interfaces,methods
    //Code resuability ,type safety
    //single class you can use different data types


}
