import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static int inputNumber(char c, Scanner scanner){
        while(true) {
            System.out.printf("Enter number %c: ", c);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(Constants.WRONG_INPUT);
                scanner.next();
            }
        }
    }
    public static String inputString(Scanner scanner){
        scanner.nextLine();
        while(true) {
            System.out.print("Enter string: ");
            try{
                String input = scanner.nextLine();
                if(!input.isEmpty()) return input;
                throw new InputMismatchException();
            }catch (InputMismatchException e){
                System.out.println(Constants.WRONG_INPUT);
            }
        }
    }
    public static int[] inputArr(int n, Scanner scanner){
        int[] input = new int[n];
        for(int i = 0; i < n; i++){
            try{
                System.out.printf("Enter %d-th number: ", i);
                input[i] = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println(Constants.WRONG_INPUT);
                scanner.next();
                i--;
            }
        }
        return input;
    }
    public static String arrToString(int[] arr){
        StringBuilder res = new StringBuilder();
        res.append("[");
        for(int i = 0; i < arr.length; i++){
            res.append(arr[i]);
            res.append(((i + 1) % arr.length == 0) ? "]" : ", ");
        }
        return res.toString();
    }

}
