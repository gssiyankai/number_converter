package number.converter;

/**
 * Factory class to instantiate numbers.
 */
public final class NumberFactory {

    private NumberFactory() {
    }

    public static Number newUnitNumber(int number) {
        return new UnitNumber(number);
    }

    public static Number newTeenNumber(int number) {
        return new TeenNumber(number);
    }

    public static Number newTentyNumber(int number) {
        return new TentyNumber(number);
    }

    public static Number newTenNumber(int number) {
        return new TenNumber(number);
    }

    public static Number newHundredNumber(int number) {
        return new HundredNumber(number);
    }

    public static Number newThousandNumber(int number) {
        return new ThousandNumber(number);
    }

    public static Number newMillionNumber(int number) {
        return new MillionNumber(number);
    }

}
