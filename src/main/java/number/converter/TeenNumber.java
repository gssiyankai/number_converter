package number.converter;

/**
 * This class represents a number from 11 to 19.
 */
class TeenNumber extends SingleNumber {

    private static final String[] TEENS = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

    private final int i;

    TeenNumber(int i) {
        this.i = i;
    }

    @Override
    public String toEnglishWords() {
        return TEENS[i - 11];
    }

}
