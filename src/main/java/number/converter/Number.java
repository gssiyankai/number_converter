package number.converter;

/**
 * All number classes implementing this interface can be translated in british english words.
 */
public interface Number {

    String AND = "and";
    String EMPTY = "";
    String SPACE = " ";

    /**
     * Returns the number english words
     */
    String toEnglishWords();

    /**
     *Appends the number english words in the given StringBuilder
     * @param words
     */
    void toEnglishWords(StringBuilder words);

}
