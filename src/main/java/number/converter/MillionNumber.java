package number.converter;

import static number.converter.NumberFactory.newHundredNumber;
import static number.converter.NumberFactory.newThousandNumber;

/**
 * This class represents a number from 1 to 999,999,999.
 */
class MillionNumber extends CompositeNumber {

    private static final String SCALE = "million";

    private final Number thousand;
    private final Number million;

    MillionNumber(int i) {
        million = (i/1_000_000 > 0) ? newHundredNumber(i/1_000_000) : null;
        thousand = (i%1_000_000 > 0) ? newThousandNumber(i%1_000_000) : null;
    }

    @Override
    public void toEnglishWords(StringBuilder words) {
        mergeBritishWords(words, million, SCALE, EMPTY, thousand);
    }

}
