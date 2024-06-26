import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    /**
     * This method is used for inputting an integer number
     * from the user with a specified prompt character.
     * Method uses try-catch construction to handle invalid input.
     * @param c The prompt character, used for indicating the user
     *          which number they are inputting.
     * @param scanner The Scanner object, used for reading System.in stream.
     * @return The number entered by the user.
     */
    public static int inputNumber(char c, Scanner scanner){
        //Try asking user to input required number, until it happens.
        while(true) {
            System.out.printf("Enter number %c: ", c);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) { //User input is incorrect, for example user entered string.
                System.out.println(Constants.WRONG_INPUT);
                scanner.next(); //Skip wrong input.
            }
        }
    }

    /**
     * This method is used for inputting some string from the user.
     * Method uses try-catch construction to handle empty strings.
     *
     * @param scanner The Scanner object, used for reading System.in stream.
     * @return The string entered by the user.
     */
    public static String inputString(Scanner scanner){
        scanner.nextLine(); //Skip first, empty, string.
        while(true) {
            System.out.print("Enter string: ");
            try{
                String input = scanner.nextLine();
                if(!input.isEmpty()) return input;
                throw new InputMismatchException();
            }catch (InputMismatchException e){ //User inputted empty string.
                System.out.println(Constants.WRONG_INPUT);
            }
        }
    }

    /**
     * This method is used for inputting integer array of size n.
     * Method uses try-catch construction to handle invalid input.
     *
     * @param n The size of array.
     * @param scanner The Scanner object, used for reading System.in stream
     * @return The integer array entered by the user.
     */
    public static int[] inputArr(int n, Scanner scanner){
        int[] input = new int[n]; //Initializing integer array of size n.
        for(int i = 0; i < n; i++){
            try{
                System.out.printf("Enter %d-th number: ", i);
                input[i] = scanner.nextInt();
            }catch (InputMismatchException e){ //User input was incorrect. Skip input, decrease i variable.
                System.out.println(Constants.WRONG_INPUT);
                scanner.next();
                i--; //It is necessary, because if input was incorrect, current i-th element will be skipped.
            }
        }
        return input;
    }

    /**
     * This method is used for converting integer array to a string.
     * Method iterates through all integers in array, appending StringBuilder.
     * Elements separated by commas, and enclosed within square brackets.
     *
     * @param arr The integer array to be converted.
     * @return String representation of inputted array of integers.
     */
    public static String arrToString(int[] arr){
        StringBuilder res = new StringBuilder();
        res.append("[");
        for(int i = 0; i < arr.length; i++){
            res.append(arr[i]);
            res.append(((i + 1) % arr.length == 0) ? "]" : ", "); //If i = index of last element in array =>
                                                                  //close brackets. Put comma otherwise.
        }
        return res.toString(); //StringBuilder != String, we need to convert it.
    }

    /**
     * This method used to force program to wait the required number of seconds.
     *
     * @param seconds The number of seconds to be waited. Seconds are multiplied
     *                by 1000, because method Thread.sleep() takes milliseconds
     *                as argument.
     */
    public static void sleep(float seconds){
        try{
            Thread.sleep((long)(seconds * 1000)); //Force program to sleep required amount of milliseconds.
        }catch (InterruptedException e){
            System.out.println(e + " in Utils.sleep method.");
        }
    }
}
