import java.util.List;

public class App {
    public static void main(String[] args) {
        String str = "//;\\n1;2;3";

        StringChecker stringChecker = new StringChecker();
        String checkValue = stringChecker.check(str);

        SeparatorFinder separatorFinder = new SeparatorFinder();
        String separator = separatorFinder.findSeparator(str);

        StringSeparator stringSeparator = new StringSeparator();
        List<Integer> integers = stringSeparator.classificationNumbers(checkValue);

        Calculator calculator = new Calculator();
        int result = calculator.add(integers);

        System.out.println("문자열 = " + str);
        System.out.println("합계 : " + result + " 구분자 : " + separator);
    }
}
