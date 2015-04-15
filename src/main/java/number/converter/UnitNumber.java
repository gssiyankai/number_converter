package number.converter;

/**
 * This class represents a number from 1 to 9.
 */
final class UnitNumber implements Number {

    private static final String[] UNITS = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    private final int i;

    UnitNumber(int i) {
        this.i = i;
    }

    @Override
    public String toEnglishWords() {
        return UNITS[i - 1];
    }

}
