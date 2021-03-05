class MarsValueConverter {
    public int changeMoneyAmount(float startAmount, float toRemove) {
        return (int) (startAmount - toRemove);
    }

    public byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum1 + sum2);
    }

    public short halfOfMoney(double startMoney) {
        return (short) (startMoney / 2);
    }

    public static void main(String[] args) {
        MarsValueConverter valueConverter = new MarsValueConverter();

        //Should be 59
        System.out.println("valueConverter.changeMoneyAmount(100f, 40.5f) = " + valueConverter.changeMoneyAmount(100f, 40.5f));
        //Should be 90
        System.out.println("valueConverter.calculateMoneySum(50, 40) = " + valueConverter.calculateMoneySum(50, 40));
        //Should be 500
        System.out.println("valueConverter.halfOfMoney(1000.9999) = " + valueConverter.halfOfMoney(1000.9999));
    }
}