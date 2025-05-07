import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome, make a choice \n.....................");
        System.out.println("Option 1: Male");
        System.out.println("Option 2: Female");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have chosen the class Male");
                Male omale = new Male();
                omale.displayInfo();
                break;
            case 2:
                System.out.println("You have chosen the class Female");
                Female ofemale = new Female();
                ofemale.displayInfo();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }
}
