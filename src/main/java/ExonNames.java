public class ExonNames {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return String.join(" ", firstName.toLowerCase(), lastName.toUpperCase());
    }

    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);
        //Should be true
        boolean namesEqualSecond = names.areNamesEqual("Exor", "Exor");
        System.out.println("names.areNamesEqual(\"Exor\", \"Exor\") = " + namesEqualSecond);
        //Should be false
        boolean namesEqualThird = names.areNamesEqual("gork", "Maxon");
        System.out.println("names.areNamesEqual(\"gork\", \"Maxon\") = " + namesEqualThird);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);
        //Should be "exor MAX"
        String fullNameSecond = names.makeFullName("Exor", "Max");
        System.out.println("names.makeFullName(\"Exor\", \"Max\") = " + fullNameSecond);
    }
}
