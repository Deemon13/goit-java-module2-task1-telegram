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

    /* Other version of getNameCode()
    public String getNameCode(String name) {
        String code = name.charAt(0) + String.valueOf( name.charAt(name.length() - 1));
        return code.toUpperCase();
    }*/

    public boolean isMoneyName(String name) {
        return (name.charAt(0) >= '0' && name.charAt(0) <= '9') && (name.charAt(name.length() - 1) >= '0' && name.charAt(name.length() - 1) <= '9');
    }

    /* Other version of isMoneyName()
        public boolean isMoneyName(String name) {
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);

        boolean firstLetterOk = firstLetter >= '0' && firstLetter <= '9';
        boolean lastLetterOk = lastLetter >= '0' && lastLetter <= '9';

        return firstLetterOk && lastLetterOk;
    }
     */

    public boolean isInvisibleName(String name) {
        return name.length() != 0 && name.isBlank();
    }

    /* other version
        public boolean isInvisibleName(String name) {
        return name.strip().isEmpty();
    }
     */

    public String makeNamePositive(String name) {
        return name
                .replace("no", "yes")
                .replace("No", "yes")
                .replace("nO", "yes")
                .replace("NO", "yes");
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

        //Should be true
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);
        //Should be true
        boolean isMoneyNameSecond = names.isMoneyName("7Max9");
        System.out.println("names.isMoneyName(\"7Max9\") = " + isMoneyNameSecond);
        //Should be false
        boolean isMoneyNameThird = names.isMoneyName("77Hero");
        System.out.println("names.isMoneyName(\"77Hero\") = " + isMoneyNameThird);

        //Should be true
        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisibleName(\" \") = " + isInvisible);
        //Should be true
        boolean isInvisibleSecond = names.isInvisibleName("");
        System.out.println("names.isInvisibleName(\"\") = " + isInvisibleSecond);
        //Should be true
        boolean isInvisibleThird = names.isInvisibleName("\n");
        System.out.println("names.isInvisibleName(\"\n\") = " + isInvisibleThird);
        //Should be false
        boolean isInvisibleFourth = names.isInvisibleName("\nMiag");
        System.out.println("names.isInvisibleName(\"\nMiag\") = " + isInvisibleFourth);

        //Should be YesMont
        String positive = names.makeNamePositive("NoMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);
        //Should be yesmad
        String positiveSecond = names.makeNamePositive("Nomad");
        System.out.println("names.makeNamePositive(\"Nomad\") = " + positiveSecond);
        //Should be Heyest
        String positiveThird = names.makeNamePositive("Henot");
        System.out.println("names.makeNamePositive(\"Henot\") = " + positiveThird);
        //Should be Berul
        String positiveFourth = names.makeNamePositive("Berul");
        System.out.println("names.makeNamePositive(\"Berul\") = " + positiveFourth);
    }
}
