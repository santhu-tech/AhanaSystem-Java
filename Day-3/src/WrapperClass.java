public class WrapperClass {
    //int,char,float,dobule,long,byte,short -->Primitive datatype

    //converting primitive data type into object
    //int -->Integer ;
    //float -->Float;
    //double -->Double;
    //long --> Long;
    //boolean =Boolean;

    //Utlility fun -->Sort,Max,min  //Collection framework

    //Integer.parseInt(String s);

    //Boxing,UnBoxing

    public static void main(String[] args) {
        int p=5;
        //Converting your int to Integer
        Integer a=Integer.valueOf(p); //Boxing
        //Unboxing
        int b=a.intValue();
        //where to use
        //ArrayList,HashMap,set,Queue
        String numstring="123";  //utility method
        int parsedint=Integer.parseInt(numstring);
        //double pp=Double.parseDouble();
        System.out.println(parsedint);


    }
}
