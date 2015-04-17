package number.converter;

/**
 * This class represents a number that is a multiple of 10 smaller than 100.
 */
class TentyNumber extends SingleNumber {

    private static final String[] TENS = { "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    private final int i;

    TentyNumber(int i) {
        this.i = i;
    }

    @Override
    public String toEnglishWords() {
        return TENS[i/10 - 1];
    }

}
