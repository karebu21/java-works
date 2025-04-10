class Mwanafunzi {
    // Attributes
    int RegNo;
    String name;

    //constructor
    public Mwanafunzi (int RegNo, String name) {
        this.RegNo = RegNo;
        this.name = name;
    }

    //methods
    public void printInfo (String Reg, String username) {
        System.out.println("Student reg number is: " + Reg);
        System.out.println("Student name is: " + username + "\n");
    }
}

public class Student {
    public static void main(String[] args) {
        Mwanafunzi std_1 = new Mwanafunzi(12343434, "Amina");

        std_1.printInfo("333333333", "yeriko");

    }
}
