package number.converter;


/**
 * Abstract class representing a single number.
 */
abstract class SingleNumber implements Number {

    @Override
    public void toEnglishWords(StringBuilder words) {
        if(words.length()>0) {
            words.append(SPACE);
        }
        words.append(toEnglishWords());
    }

}
