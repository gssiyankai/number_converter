package number.converter;


import org.fest.assertions.api.StringAssert;
import org.junit.Test;

import static number.converter.NumberFactory.newTeenNumber;
import static org.fest.assertions.api.Assertions.assertThat;

public class TeenNumberTest {

    @Test public void
    it_should_convert_to_british_words_numbers_from_11_to_19() {
        assertThatNumberInBritishWords(11).isEqualTo("eleven");
        assertThatNumberInBritishWords(12).isEqualTo("twelve");
        assertThatNumberInBritishWords(13).isEqualTo("thirteen");
        assertThatNumberInBritishWords(14).isEqualTo("fourteen");
        assertThatNumberInBritishWords(15).isEqualTo("fifteen");
        assertThatNumberInBritishWords(16).isEqualTo("sixteen");
        assertThatNumberInBritishWords(17).isEqualTo("seventeen");
        assertThatNumberInBritishWords(18).isEqualTo("eighteen");
        assertThatNumberInBritishWords(19).isEqualTo("nineteen");
    }

    StringAssert assertThatNumberInBritishWords(int number) {
        return assertThat(newTeenNumber(number).toEnglishWords());
    }

}
