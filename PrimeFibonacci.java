public class PrimeFibonacci {

    
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    
    public static void findPrimeFibonacci() {
        int a = 0, b = 1;
        while (b < 100000) {
            if (isPrime(b)) {
                System.out.print(b + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        findPrimeFibonacci();
    }
}
