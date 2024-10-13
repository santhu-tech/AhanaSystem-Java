public class SwitchcExpressio {
    public static void main(String[] args) {
        String day="MONDAY";
        String message =switch(day){
            case "MONDAY" -> {
                yield "Start of Monday";  //return

            }
            case "TUESDAY" ->{
                yield "Start of Tuesday";
            }
            default -> {
                yield "WEekend";
            }
        };
        System.out.println(message);
    }
}