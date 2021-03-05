class DigitSplitter {
    public int getFirstDigit(int number) {
        return number / 10;
    }

    public int getSecondDigit(int number) {
        return number % 10;
    }

    public static void main(String[] args) {
        DigitSplitter split = new DigitSplitter();

        //Should be 1
        System.out.println("split.getFirstDigit(15) = " + split.getFirstDigit(15));
        //Should be 5
        System.out.println("split.getSecondDigit(15) = " + split.getSecondDigit(15));
    }
}
