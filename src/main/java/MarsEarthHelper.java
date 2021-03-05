public class MarsEarthHelper {
    public int convertAppleCount(float count) {
        int number = (int) count;
        return number;
    }

    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();

        //Should be 10
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));
        //Should be 3
        System.out.println("convertAppleCount(3.4f) = " + helper.convertAppleCount(3.4f));
        //Should be 10
        System.out.println("convertAppleCount(10.99) = " + helper.convertAppleCount(10.99f));
    }
}
