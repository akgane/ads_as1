public class MyApplication {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{3, 1, 2, 6, 3};

//        System.out.println(minElement(n, arr));

//        System.out.println(average(n, arr));

        System.out.println(isPrime(n));
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
}
