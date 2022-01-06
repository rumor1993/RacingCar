import java.util.List;

public class Calculator {
    public int add(List<Integer> numbers) {
        int result = 0;
        for (Integer item : numbers) result += item;
        return result;
    }
}
