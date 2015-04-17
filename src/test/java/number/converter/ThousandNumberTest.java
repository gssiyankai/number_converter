package number.converter;


import org.fest.assertions.api.StringAssert;
import org.junit.Test;

import static number.converter.NumberFactory.newThousandNumber;
import static org.fest.assertions.api.Assertions.assertThat;

public class ThousandNumberTest {

    @Test public void
    it_should_convert_to_british_words_numbers_from_1_to_999_999() {
        assertThatNumberInBritishWords(9).isEqualTo("nine");
        assertThatNumberInBritishWords(15).isEqualTo("fifteen");
        assertThatNumberInBritishWords(67).isEqualTo("sixty seven");
        assertThatNumberInBritishWords(789).isEqualTo("seven hundred and eighty nine");
        assertThatNumberInBritishWords(2_000).isEqualTo("two thousand");
        assertThatNumberInBritishWords(5_000).isEqualTo("five thousand");
        assertThatNumberInBritishWords(846_000).isEqualTo("eight hundred and forty six thousand");
        assertThatNumberInBritishWords(10_001).isEqualTo("ten thousand and one");
    }

    StringAssert assertThatNumberInBritishWords(int number) {
        return assertThat(newThousandNumber(number).toEnglishWords());
    }

}
