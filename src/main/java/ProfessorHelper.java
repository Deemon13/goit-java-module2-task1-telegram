class ProfessorHelper {

    public boolean areNumbersCool(int number1, int number2) {
        return number1 == number2;
    }

    //Test output
    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3)); //Should be true
        System.out.println("areNumbersCool(5, 7) = " + helper.areNumbersCool(5, 7)); //Should be false
    }
}
