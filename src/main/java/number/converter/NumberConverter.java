package number.converter;


/**
 * This class is to give the british english equivalent of a number up to 999,999,999
 */
public class NumberConverter {

    public String convert(int i) {
        return NumberFactory.newMillionNumber(i).toEnglishWords();
    }

}
