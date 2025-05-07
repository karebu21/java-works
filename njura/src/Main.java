public class OddNumbers {

    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline at the end
    }
}
public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 20:");
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline at the end
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
public class EvenNumbers {

    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline at the end
    }
}