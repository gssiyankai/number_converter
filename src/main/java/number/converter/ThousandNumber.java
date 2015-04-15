package number.converter;

import static number.converter.NumberFactory.newHundredNumber;

/**
 * This class represents a number from 1 to 999,999.
 */
class ThousandNumber extends CompositeNumber {

    private static final String SCALE = "thousand";

    private final Number hundred;
    private final Number thousand;

    ThousandNumber(int i) {
        thousand = (i/1_000 > 0) ? newHundredNumber(i/1_000) : null;
        hundred = (i%1_000 > 0) ? newHundredNumber(i%1_000) : null;
    }

    @Override
    public String toEnglishWords() {
        return mergeBritishWords(thousand, SCALE, EMPTY, hundred);
    }

}
