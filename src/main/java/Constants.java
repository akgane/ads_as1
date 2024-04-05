public class Constants {
    //The \s at the end of a text block is used to
    //add a space after the output text
    public static final String METHODS_LIST =
            """
            

                            ====================
                            1) minElement(int n, int[] arr).
                            2) average(int n, int[] arr).
                            3) isPrime(int n).
                            4) factorial(int n).
                            5) fibonacci(int n).
                            6) power(int a, int n).
                            7) reverseArray(int n, int[] arr).
                            8) isDigit(String s).
                            9) binomial(int n, int k).
                            10) gcd(int a, int b).
                            0) Exit.
                            Enter method to be called:\s""";
    /*
    All strings below are static strings with placeholders.
    Can be used with System.out.printf(String s, placeholders values...)
     */
    public static final String WRONG_INPUT = "Wrong input, try again.";
    public static final String M_MINIMAL_ELEMENT = "Minimal element of array: %d.";
    public static final String M_AVERAGE = "Average of array: %f.";
    public static final String M_NUMBER_DEFINITION = "Number %d is %s.";
    public static final String M_FACTORIAL = "Factorial of number %d is %d.";
    public static final String M_FIBONACCI = "%d-th number of fibonacci sequence is %d.";
    public static final String M_POWER = "%d to the power of %d is %d.";
    public static final String M_REVERSE = "Reversed array: %s.";
    public static final String M_IS_DIGIT = "String %s %s digit.";
    public static final String M_BINOMIAL =
            "Binomial coefficient of number n = %d and k = %d is %d.";
    public static final String M_GCD =
            "Greatest common divisor of number %d and %d is %d.";
}
