public class Male extends Human {
    String gender = "Male";

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gender: " + gender);
    }
}

