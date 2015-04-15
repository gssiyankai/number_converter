package number.converter;


import org.fest.assertions.api.StringAssert;
import org.junit.Test;

import static number.converter.NumberFactory.newTenNumber;
import static org.fest.assertions.api.Assertions.assertThat;

public class TenNumberTest {

    @Test public void
    it_should_convert_to_british_words_numbers_from_1_to_99() {
        assertThatNumberInBritishWords(7).isEqualTo("seven");
        assertThatNumberInBritishWords(11).isEqualTo("eleven");
        assertThatNumberInBritishWords(23).isEqualTo("twenty three");
        assertThatNumberInBritishWords(45).isEqualTo("forty five");
        assertThatNumberInBritishWords(87).isEqualTo("eighty seven");
        assertThatNumberInBritishWords(99).isEqualTo("ninety nine");
    }

    StringAssert assertThatNumberInBritishWords(int number) {
        return assertThat(newTenNumber(number).toEnglishWords());
    }

}
