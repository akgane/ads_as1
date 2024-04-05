public class MyApplication {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{3, 1, 2, 6, 3};

//        System.out.println(minElement(n, arr));

//        System.out.println(average(n, arr));

//        System.out.println(isPrime(n));

//        System.out.println(factorial(n));

//        System.out.println(fibonacci(n));

//        System.out.println(power(3, 3));

//        int[] result = reverseArray(n, arr);
//        for(int i : result) System.out.print(i + " ");
//        System.out.println();

//        System.out.println(isDigit("123a321"));

//        System.out.println(binomial(7, 3));

        System.out.println(gcd(32, 48));
    }

    /**
     * This method finds minimum element of given array.
     * It uses a for loop.
     * Time complexity: O(n), where n is the length of the array.
     * For loop iterates through all elements of array,
     * resulting in linear time complexity.
     *
     * @param n The given number of elements in array.
     * @param arr The given array of integer numbers of size n.
     * @return The minimum element of array.
     */
    static int minElement(int n, int[] arr){
        int min = arr[0];
        //iterating through all numbers from arr, comparing with variable 'min'
        for(int num : arr) if(min > num) min = num;
        return min;
    }

    /**
     * This method calculates the average of the elements of a given
     * array.
     * It uses a for loop.
     * Time complexity: O(n), where n is the length of the array.
     * For loop iterates through all elements of array, resulting
     * in linear time complexity.
     *
     * @param n The given number of elements in array.
     * @param arr The given array of integer numbers of size n.
     * @return The average of numbers of array.
     */
    static float average(int n, int[] arr){
        int sum = 0;
        //summarizing all numbers from arr, getting total of all numbers
        for(int num : arr) sum += num;
        //average = sum of all elements divided by count of elements
        return (float) sum / n;
    }

    /**
     * This method checks if given number is prime or composite.
     * It uses a for loop.
     * Time complexity: O(sqrt(n)), where n is the given number.
     * For loop iterates through numbers from 2 to sqrt(n),
     * resulting in square root time complexity.
     *
     * @param n The given number n, for which the method checks if
     *          it is prime.
     * @return true if given number is prime, or false if given
     * number is composite.
     */
    static boolean isPrime(int n){
        if(n == 0 || n == 1) return false; //0 and 1 neither prime nor composite
        //if there exists a positive integer x (x != 1, n)
        //for which n/x = integer => n not prime
        for(int i = 2; i < Math.sqrt(n); i++) if(n % i == 0) return false;
        return true;
    }

    /**
     * This method calculates the factorial of a given number.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the given number.
     * The recursive algorithm iterates through all numbers from n
     * to 1, resulting in linear time complexity.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    static int factorial(int n){
        if(n == 1) return 1;
        //factorial(n) = 1*2*3*...*n
        return n * factorial(n - 1);
    }

    /**
     * This method calculates n-th element in the Fibonacci sequence.
     * It uses a recursive approach.
     * Time complexity: O(2^n), where n is the given number.
     * The recursive algorithm calls itself for each non-base case,
     * resulting in exponential time complexity.
     *
     * @param n The index of the number in the Fibonacci sequence
     *          to be calculated.
     * @return The n-th element in the Fibonacci sequence.
     */
    static int fibonacci(int n){
        //fibonacci(1) = 1, fibonacci(0) = 0
        if(n == 1) return 1;
        else if (n == 0) return 0;
        //fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * This method calculates the power n of a number.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the exponent.
     * The recursive algorithm multiplies the base 'a' by itself
     * 'n' times, resulting in linear time complexity.
     *
     * @param a The given base number.
     * @param n The given exponent.
     * @return The number a^n.
     */
    static int power(int a, int n){
        if(n == 1) return a;
        return a * power(a, n - 1);
    }

    /**
     * This method reverses a given array.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the length of the array.
     * The recursive algorithm swaps the elements at the beginning
     * and end of the array, and then recursively calls itself on
     * the rest of the array. This results in linear time complexity.
     *
     * @param n The given number of elements in array.
     * @param arr The given array of integer numbers.
     * @return The given array in reverse order.
     */
    static int[] reverseArray(int n, int[] arr){
        //swap first element, that wasnt swapped yet, and last, that wasnt swapped
        swapElements(arr.length - n, n - 1, arr);
        //if n - 1 == Math.floor(arr.length / 2f) =>
        //method already swapped middle elements => pointless to swap other elements
        if(n - 1 == Math.floor(arr.length / 2f)) return arr;
        //move pointer n (last element that wasnt swapped)
        return reverseArray(n - 1, arr);
    }

    /**
     * This method swaps i-th and j-th elements of array.
     * It operates with constants.
     * Time complexity: O(1), resulting in constant time complexity.
     *
     * @param i The index of first element to be swapped.
     * @param j The index of second element to be swapped.
     * @param arr The array, which elements will be swapped.
     */
    static void swapElements(int i, int j, int[] arr){
        //swap i-th and j-th element
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        //pointless to return array, because arr is pointer to outer array
    }

    /**
     * This method checks if a given string contains only digits.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the length of the string.
     * The recursive algorithm checks if first character is digit,
     * and then calls itself for rest of characters in the string.
     * This results in linear time complexity.
     *
     * @param s The given string to be checked.
     * @return true if the given string contains only numeric
     * characters, or false otherwise.
     */
    static boolean isDigit(String s){
        if(s.isEmpty()) return true; //all characters checked, there is no not digit chars
        int c = s.charAt(0);
        if(48 > c || 57 < c) return false; //checking character using ascii table
        return isDigit(s.substring(1)); //skip first character
    }

    /**
     * This method calculates the binomial coefficient C(n, k).
     * It uses a recursive approach based on the identity
     * C(n, k) = C(n - 1, k - 1) + C(n - 1, k).
     * Time complexity: O(2^n), where n is the first parameter.
     * This is because each call to this method results in two
     * recursive calls unless it falls into the base case.
     * The recursive algorithm calculates the binomial coefficient
     * by breaking it down into two smaller coefficients, resulting
     * in the exponential time complexity.
     *
     * @param n The n number of binomial coefficient to be calculated.
     * @param k The k number of binomial coefficient to be calculated.
     * @return The binomial coefficient of numbers n and k.
     */
    static int binomial(int n, int k){
        if(k == 0 || k == n) return 1; //binomial coefficient rules
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    /**
     * This method calculates the greatest common divisor
     * (GCD) of two numbers.
     * It uses a recursive approach, which need to be used
     * in Euclidean algorithm.
     * Time complexity: O(log(min(a,b)), where 'a' and 'b'
     * are the input number. With each recursive call, the
     * problem size decreases geometrically.
     *
     * @param a The first number of GCD.
     * @param b The second number of GCD.
     * @return The greatest common divisor (GCD) of 'a' and 'b'.
     */
    static int gcd(int a, int b){
        //gcd rules
        if(a == 0) return b;
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
