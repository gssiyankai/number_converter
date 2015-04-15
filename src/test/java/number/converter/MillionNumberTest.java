package number.converter;


import org.fest.assertions.api.StringAssert;
import org.junit.Test;

import static number.converter.NumberFactory.newMillionNumber;
import static org.fest.assertions.api.Assertions.assertThat;

public class MillionNumberTest {

    @Test public void
    it_should_convert_to_british_words_numbers_from_1_to_999_999_999() {
        assertThatNumberInBritishWords(3).isEqualTo("three");
        assertThatNumberInBritishWords(12).isEqualTo("twelve");
        assertThatNumberInBritishWords(199_267).isEqualTo("one hundred and ninety nine thousand two hundred and sixty seven");
        assertThatNumberInBritishWords(1_000_000).isEqualTo("one million");
        assertThatNumberInBritishWords(735_000_000).isEqualTo("seven hundred and thirty five million");
        assertThatNumberInBritishWords(999_999_999).isEqualTo("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine");
    }

    StringAssert assertThatNumberInBritishWords(int number) {
        return assertThat(newMillionNumber(number).toEnglishWords());
    }

}
