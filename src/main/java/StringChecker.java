import java.util.regex.Pattern;

public class StringChecker {
    public String check(String value) {
        SeparatorFinder separatorFinder = new SeparatorFinder();
        value = value.replaceAll(separatorFinder.findSeparator(value), "");
        value = value.replaceAll("//", "");
        value = value.replaceAll("\n", "");
        value = value.replaceAll(";", "");
        value = value.replaceAll(",", "");

        try {
            Integer.parseInt(value);
        } catch (RuntimeException e) {
            throw e;
        }

        return value;
    }
}
