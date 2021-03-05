class ProfessorHelper {

    public boolean areNumbersCool(int number1, int number2) {
        return number1 == number2;
    }

    public boolean areNumbersFatal(int first, int second) {
        return first * 5 + 3 == second;
    }

    //Test output
    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3)); //Should be true
        System.out.println("areNumbersCool(5, 7) = " + helper.areNumbersCool(5, 7)); //Should be false
        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(1, 8)); //Should be true
        System.out.println("areNumbersFatal(1, 9) = " + helper.areNumbersFatal(1, 9)); //Should be false
    }
}
