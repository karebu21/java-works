class Car {
    //attributes
    String make;
    String model;
    int year;

    //constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //method to display
    public void displayAttributes() {
        String brand =  make.toUpperCase();

        System.out.println("\n");
        System.out.println("    Make " + make);
        System.out.println("    Model " + model);
        System.out.println("    Year " + year);
    }
}

public class Main {
    public static void Sum(int t, int r) {
        int sum = r + t;
        System.out.println("Look its done!!" + sum );
    }

    public static void main(String[] args) {
        //object

        Car car1 = new Car("Toyota", "Harrier", 2016);
        Car car2 = new Car("Tesla", "Model S", 2021);

        car1.displayAttributes();
        car2.displayAttributes();
    }
}