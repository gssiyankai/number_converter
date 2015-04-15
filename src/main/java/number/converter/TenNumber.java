package number.converter;

import static number.converter.NumberFactory.newTeenNumber;
import static number.converter.NumberFactory.newTentyNumber;
import static number.converter.NumberFactory.newUnitNumber;

/**
 * This class represents a number from 1 to 99.
 */
class TenNumber extends CompositeNumber {

    private final Number unit;
    private final Number ten;

    TenNumber(int i) {
        if(i > 10  && i < 20) {
            unit = null;
            ten = newTeenNumber(i);
        } else {
            ten = (i/10 > 0) ? newTentyNumber(i - i%10) : null;
            unit = (i%10 > 0) ? newUnitNumber(i%10) : null;
        }
    }

    @Override
    public String toEnglishWords() {
        return mergeBritishWords(ten, EMPTY, EMPTY, unit);
    }

}
