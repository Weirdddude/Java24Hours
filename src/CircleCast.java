import java.lang.ProcessBuilder.Redirect.Type;

public class CircleCast {
    public static void main(String[] args) {
        float newNumber = Float.parseFloat(args[0]);
        Float newFloat = newNumber;
        int newInt = newFloat.intValue();
        System.out.println(newInt);
    }
}
