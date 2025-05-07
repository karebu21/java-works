public class Female extends Human {
    String gender = "Female";

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gender: " + gender);
    }
}
