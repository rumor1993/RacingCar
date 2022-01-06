import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparatorFinder {
    public String findSeparator(String value) {
        Pattern pattern = Pattern.compile("(\\/\\/)(.*?)(\\\\n)");
        Matcher matcher = pattern.matcher(value);

        if (matcher.find()) return matcher.group(2);
        return "";
    }
}
