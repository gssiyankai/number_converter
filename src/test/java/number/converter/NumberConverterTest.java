package number.converter;


import org.fest.assertions.api.StringAssert;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class NumberConverterTest {

    private NumberConverter converter;

    @Before
    public void setup() {
        converter = new NumberConverter();
    }

    @Test public void
    it_should_convert_numbers() {
        assertThatConversionOf(56_945_781).isEqualTo("fifty six million nine hundred and forty five thousand seven hundred and eighty one");
    }

    private StringAssert assertThatConversionOf(int number) {
        return assertThat(converter.convert(number));
    }

}
