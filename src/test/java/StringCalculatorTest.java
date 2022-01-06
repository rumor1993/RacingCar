import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class StringCalculatorTest {

    @Test
    @DisplayName("쉼표(,) 또는 콜론(:)을 구분자를 기준으로 분리")
    void case1() {
        String value = "1:2";
        StringSeparator stringSeparator = new StringSeparator();
        List<Integer> numbers = stringSeparator.classificationNumbers(value);

        assertThat(numbers.size()).isEqualTo(2);
        assertThat(numbers).isEqualTo(Arrays.asList(1, 2));
    }

    @Test
    @DisplayName("구분자를 기준으로 분리한 각 숫자의 합을 반환")
    void case2() {
        String value = "1,2:3";
        Calculator calculator = new Calculator();
        StringSeparator stringSeparator = new StringSeparator();
        List<Integer> numbers = stringSeparator.classificationNumbers(value);
        int result = calculator.add(numbers);

        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("“//”와 “\\n” 사이에 위치하는 문자를 커스텀 구분자로 인식한다.")
    void case3() {
        String value = "//;\\n1;2;3";
        SeparatorFinder separatorFinder = new SeparatorFinder();
        String separator = separatorFinder.findSeparator(value);
        assertThat(separator).isEqualTo(";");
    }

    @Test
    @DisplayName("문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.")
    void case4() {
        String value = "//;\\n1;2;3";
        StringChecker stringChecker = new StringChecker();
        String check = stringChecker.check(value);

        System.out.println("check = " + check);

        assertThat(Integer.parseInt(check)).isInstanceOf(Integer.TYPE);

    }
}