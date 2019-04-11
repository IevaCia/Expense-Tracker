package ieva.expense.tracker.utils;

public class EqUtils {

    public static boolean eqIgnCase(String str1, String str2) {
        if (str1 != null) {
            return str1.equalsIgnoreCase(str2);
        }
        return str1 == str2;
    }
}
