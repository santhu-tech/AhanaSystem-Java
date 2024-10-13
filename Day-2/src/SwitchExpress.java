public class SwitchExpress {
    public static void main(String[] args) {
        //Switch Expression-->Yield,->
        //Java -8 concepts -->Lambada function ,Streams
        int day=2;
        String dayName =switch(day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 ->"Tuesday";
            case 4 -> "wednesday";
            case 5 -> "Thursday";
            case 6 ->"Friday";
            default ->"Invalid input";

        };
        System.out.println("Day :" +dayName);
    }

}
