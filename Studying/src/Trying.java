public class Trying {

    //return type
    public static double balance(double total_fee, double fee) {
        double remaining = total_fee - fee;
        return remaining;
    }

    //Non return type
    public static void newBalance(double total_fee, double fee) {
        double remaining = total_fee - fee;
        System.out.println("REMAINING IS " + remaining);
    }

    public static void main(String[] args) {
        // calling return type
        System.out.println("Remaining from fun1 : " + balance(10000000.00, 34000));

        // calling non return type
        newBalance(10000000.00, 34000);
    }
}
