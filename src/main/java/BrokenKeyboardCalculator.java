class BrokenKeyboardCalculator {
    public int add(int a, int b) {
        a += b;
        return a;
    }

    public int sub(int a, int b) {
        a -= b;
        return a;
    }

    public int multiply(int a, int b) {
        a *= b;
        return a;
    }

    public int divide(int a, int b) {
        a /= b;
        return a;
    }

    public static void main(String[] args) {
        BrokenKeyboardCalculator brokenCalc = new BrokenKeyboardCalculator();

        //Should be 8
        System.out.println("brokenCalc.add(5, 3) = " + brokenCalc.add(5, 3));

        //Should be 1
        System.out.println("brokenCalc.sub(8, 7) = " + brokenCalc.sub(8, 7));

        //Should be 100
        System.out.println("brokenCalc.multiply(1, 100) = " + brokenCalc.multiply(1, 100));

        //Should be 2
        System.out.println("brokenCalc.divide(8, 4) = " + brokenCalc.divide(8, 4));
    }
}
