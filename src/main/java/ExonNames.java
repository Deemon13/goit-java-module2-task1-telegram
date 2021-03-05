public class ExonNames {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return String.join(" ", firstName.toLowerCase(), lastName.toUpperCase());
    }

    public boolean isNameLucky(String name) {
        return name.toLowerCase().contains("a") || name.toLowerCase().contains("o");
    }

    public String getNameCode(String name) {
        String firstChar = Character.toString(name.toUpperCase().charAt(0));
        String lastChar = Character.toString(name.toUpperCase().charAt(name.length() - 1));
        return firstChar + lastChar;
    }

    /* Other Variant
    public String getNameCode(String name) {
        String code = name.charAt(0) + String.valueOf( name.charAt(name.length() - 1));
        return code.toUpperCase();
    }*/

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

        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);
        //Should be true
        boolean isNameLuckySecond = names.isNameLucky("Exma");
        System.out.println("names.isNameLucky(\"Exma\") = " + isNameLuckySecond);
        //Should be false
        boolean isNameLuckyThird = names.isNameLucky("Igun");
        System.out.println("names.isNameLucky(\"Igun\") = " + isNameLuckyThird);

        //Should be BA
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);
        //Should be MT
        String nameCodeSecond = names.getNameCode("Morat");
        System.out.println("names.getNameCode(\"Morat\") = " + nameCodeSecond);
        //Should be X
        String nameCodeThird = names.getNameCode("x");
        System.out.println("names.getNameCode(\"x\") = " + nameCodeThird);
    }
}
