package number.converter;


/**
 * This class represents a number that can be viewed as a group of other numbers.
 */
abstract class CompositeNumber implements Number {

    @Override
    public String toEnglishWords() {
        StringBuilder words = new StringBuilder();
        toEnglishWords(words);
        return words.toString();
    }

    /**
     * Merges two numbers converted in british english words given a scale and a separator.
     *
     * @param words the words containing the merged words
     * @param msn the most significant number
     * @param scale the most significant number scale
     * @param delimiter the delimiter between the most and the least significant numbers
     * @param lsn the least significant number
     */
    void mergeBritishWords(StringBuilder words, Number msn, String scale, String delimiter, Number lsn) {
        if(msn != null) {
            msn.toEnglishWords(words);
            if(!scale.isEmpty()) {
                words.append(SPACE);
                words.append(scale);
            }
        }
        if(lsn != null) {
            if(words.length()>0 && !delimiter.isEmpty()) {
                words.append(SPACE);
                words.append(delimiter);
            }
            lsn.toEnglishWords(words);
        }
    }

}
