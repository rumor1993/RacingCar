import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class StringCalculatorTest {

    @Test
    @DisplayName("쉼표(,) 또는 콜론(:)을 구분자를 기준으로 분리")
    void case1() {
        String value = "1:2";
        StringSeparator stringSeparator = new StringSeparator();
        List<Integer> numbers = stringSeparator.classificationNumbers(value);

        assertThat(numbers.size()).isEqualTo(2);
        assertThat(numbers).isEqualTo(Arrays.asList(1,2));
    }

    @Test
    @DisplayName("구분자를 기준으로 분리한 각 숫자의 합을 반환")
    void case2() {
        String value = "1,2";
        Calculator calculator = new Calculator();
        StringSeparator stringSeparator = new StringSeparator();
        List<Integer> numbers = stringSeparator.classificationNumbers(value);
        int result = calculator.add(numbers);

        assertThat(result).isEqualTo(3);
    }
}