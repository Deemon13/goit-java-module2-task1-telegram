public class ExonNames {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
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
    }
}
