public class Calculator {

    public static int add(int value1, int value2) {
        return value1 + value2;
    }


    public static String curfew(int value) {
        if (value > 100) {
            return "curfew";
        } else {
            return "no curfew";
        }
    }
}
