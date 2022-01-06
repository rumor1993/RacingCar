import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSeparator {
    public List<Integer> classificationNumbers(String str) {
        List<Integer> numbers = new ArrayList<>();

        Pattern pattern = Pattern.compile("[1-9]");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) numbers.add(Integer.parseInt(matcher.group()));
        return numbers;
    }

}
