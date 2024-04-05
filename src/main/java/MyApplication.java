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

        System.out.println(binomial(7, 3));
    }

    static int minElement(int n, int[] arr){
        int min = arr[0];
        for(int i = 0; i < n; i++) if(min > arr[i]) min = arr[i];
        return min;
    }

    static float average(int n, int[] arr){
        int sum = 0;
        for(int num : arr) sum += num;
        return (float) sum / n;
    }

    static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        for(int i = 2; i < Math.sqrt(n); i++) if(n % i == 0) return false;
        return true;
    }

    static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    static int fibonacci(int n){
        if(n == 1) return 1;
        else if (n == 0) return 0;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int power(int a, int n){
        if(n == 1) return a;
        return a * power(a, n - 1);
    }

    static int[] reverseArray(int n, int[] arr){
        swapElements(arr.length - n, n - 1, arr);
        if(n - 1 == Math.floor(arr.length / 2f)) return arr;
        return reverseArray(n - 1, arr);
    }

    static void swapElements(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static boolean isDigit(String s){
        if(s.isEmpty()) return true;
        int c = s.charAt(0);
        if(48 > c || 57 < c) return false;
        return isDigit(s.substring(1));
    }

    static int binomial(int n, int k){
        if(k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
}
