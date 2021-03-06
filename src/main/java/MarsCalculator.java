class MarsCalculator {

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sub(int a, int b, int c) {
        return a - b - c;
    }

    public int multiply(int a, int b, int c) {
        return sum(a, b, c)*sub(a,b,c);
    }

    public float divide(int a, int b, int c) {
        return sum(a, b, c)/10f;
    }

    public static void main(String[] args) {
        MarsCalculator calc = new MarsCalculator();

        //Should be 6
        System.out.println("calc.sum(1, 2, 3) = " + calc.sum(1, 2, 3));

        //Should be -4
        System.out.println("calc.sub(1, 2, 3) = " + calc.sub(1, 2, 3));

        //Should be -24
        System.out.println("calc.multiply(1, 2, 3) = " + calc.multiply(1, 2, 3));

        //Should be 0.6
        System.out.println("calc.divide(1, 2, 3) = " + calc.divide(1, 2, 3));
    }
}
