package number.converter;

import static number.converter.NumberFactory.*;

/**
 * This class represents a number from 1 to 999.
 */
class HundredNumber extends CompositeNumber {

    private static final String SCALE = "hundred";

    private final Number ten;
    private final Number hundred;

    HundredNumber(int i) {
        hundred = (i/100 > 0) ? newUnitNumber(i/100) : null;
        ten = (i%100 > 0) ? newTenNumber(i%100) : null;
    }

    @Override
    public void toEnglishWords(StringBuilder words) {
        mergeBritishWords(words, hundred, SCALE, AND, ten);
    }

}
