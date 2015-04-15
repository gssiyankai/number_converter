package number.converter;


/**
 * This class represents a number that can be viewed as a group of other numbers.
 */
abstract class CompositeNumber implements Number {

    static final String AND = "and";
    static final String EMPTY = "";
    static final String SPACE = " ";


    /**
     * Merges two numbers converted in british english words given a scale and a separator.
     * @param msn the most significant number
     * @param scale the most significant number scale
     * @param delimiter the delimiter between the most and the least significant numbers
     * @param lsn the least significant number
     * @return a string
     */
    String mergeBritishWords(Number msn, String scale, String delimiter, Number lsn) {
        String words = "";
        if(msn != null) {
            words += msn.toEnglishWords();
            if(!scale.isEmpty()) {
                words += SPACE + scale;
            }
        }
        if(lsn != null) {
            if(!words.isEmpty()) {
                words += SPACE;
                if(!delimiter.isEmpty()) {
                    words += delimiter + SPACE;
                }
            }
            words += lsn.toEnglishWords();
        }
        return words;
    }

}
