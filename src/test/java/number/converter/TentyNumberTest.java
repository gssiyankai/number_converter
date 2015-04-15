package number.converter;


import org.fest.assertions.api.StringAssert;
import org.junit.Test;

import static number.converter.NumberFactory.newTentyNumber;
import static org.fest.assertions.api.Assertions.assertThat;

public class TentyNumberTest {

    @Test public void
    it_should_convert_to_british_words_numbers_multiple_of_10_smaller_than_100() {
        assertThatNumberInBritishWords(10).isEqualTo("ten");
        assertThatNumberInBritishWords(20).isEqualTo("twenty");
        assertThatNumberInBritishWords(30).isEqualTo("thirty");
        assertThatNumberInBritishWords(40).isEqualTo("forty");
        assertThatNumberInBritishWords(50).isEqualTo("fifty");
        assertThatNumberInBritishWords(60).isEqualTo("sixty");
        assertThatNumberInBritishWords(70).isEqualTo("seventy");
        assertThatNumberInBritishWords(80).isEqualTo("eighty");
        assertThatNumberInBritishWords(90).isEqualTo("ninety");
    }

    StringAssert assertThatNumberInBritishWords(int number) {
        return assertThat(newTentyNumber(number).toEnglishWords());
    }

}
