package OOP_Homework_Transport;

public class ValidationUtil {
    public static String validOrDefault(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }
}
