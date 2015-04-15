package number.converter;


import org.fest.assertions.api.StringAssert;
import org.junit.Test;

import static number.converter.NumberFactory.newUnitNumber;
import static org.fest.assertions.api.Assertions.assertThat;

public class UnitNumberTest {

    @Test public void
    it_should_convert_to_british_words_numbers_from_1_to_9() {
        assertThatNumberInBritishWords(1).isEqualTo("one");
        assertThatNumberInBritishWords(2).isEqualTo("two");
        assertThatNumberInBritishWords(3).isEqualTo("three");
        assertThatNumberInBritishWords(4).isEqualTo("four");
        assertThatNumberInBritishWords(5).isEqualTo("five");
        assertThatNumberInBritishWords(6).isEqualTo("six");
        assertThatNumberInBritishWords(7).isEqualTo("seven");
        assertThatNumberInBritishWords(8).isEqualTo("eight");
        assertThatNumberInBritishWords(9).isEqualTo("nine");
    }

    StringAssert assertThatNumberInBritishWords(int number) {
        return assertThat(newUnitNumber(number).toEnglishWords());
    }

}
