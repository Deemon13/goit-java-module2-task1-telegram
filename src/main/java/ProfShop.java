class ProfShop {

    public boolean isPriceOk(int price) {
        return price < 1000 || price > 1000;
    }

    public float calculateRegularDiscountPrice(float price) {
        return price * 0.9f;
    }

    public boolean isDiscount50(int price) {
        return 4 * price == 1000;
    }

    public boolean isPriceHappy(int price, int year, int day) {
        return price == year * day;
    }

    public static void main(String[] args) {
        ProfShop shopCalc = new ProfShop();

        //Should be true
        System.out.println("shopCalc.isPriceOk(1500) = " + shopCalc.isPriceOk(1500));

        //Should be 1350
        System.out.println("shopCalc.calculateRegularDiscountPrice(1500) = " + shopCalc.calculateRegularDiscountPrice(1500));

        //Should be false
        System.out.println("shopCalc.isDiscount50(256) = " + shopCalc.isDiscount50(256));

        //Should be true
        System.out.println("shopCalc.isPriceHappy(23700, 3950, 6) = " + shopCalc.isPriceHappy(23700, 3950, 6));
    }
}
