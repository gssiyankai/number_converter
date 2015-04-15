package number.converter;


import org.fest.assertions.api.StringAssert;
import org.junit.Test;

import static number.converter.NumberFactory.newHundredNumber;
import static org.fest.assertions.api.Assertions.assertThat;

public class HundredNumberTest {

    @Test public void
    it_should_convert_to_british_words_numbers_from_1_to_999() {
        assertThatNumberInBritishWords(1).isEqualTo("one");
        assertThatNumberInBritishWords(17).isEqualTo("seventeen");
        assertThatNumberInBritishWords(78).isEqualTo("seventy eight");
        assertThatNumberInBritishWords(100).isEqualTo("one hundred");
        assertThatNumberInBritishWords(700).isEqualTo("seven hundred");
        assertThatNumberInBritishWords(105).isEqualTo("one hundred and five");
        assertThatNumberInBritishWords(315).isEqualTo("three hundred and fifteen");
    }

    StringAssert assertThatNumberInBritishWords(int number) {
        return assertThat(newHundredNumber(number).toEnglishWords());
    }

}
