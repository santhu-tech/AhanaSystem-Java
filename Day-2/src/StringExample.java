public class StringExample {
    public static void main(String[] args) {
        //String literals
        String str="Welcome";
        String str2="Welcome"; //Line no 4& 5 pointing to the same object in the string pool
        String str1=new String("Welcome"); //new object being created stored inside your heap memory
        String str4=new String ("Welocme");

        System.out.println(str==str2); //true (same reference ,string pool)
        System.out.println(str==str1); //false (different reference)

        System.out.println(str.equals(str1)); //true     (content is same)


    }
}
