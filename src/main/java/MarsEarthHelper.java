public class MarsEarthHelper {
    public int convertAppleCount(float count) {
        return (int) count;
    }

    public byte countAppleCount(int garden1Count, int garden2Count) {
        return (byte) (garden1Count + garden2Count);
    }

    public float calculateTotalAppleWeight(double treeAge) {
        return (float) (treeAge * 9.18);
    }

    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();

        //Should be 10
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));
        //Should be 3
        System.out.println("convertAppleCount(3.4f) = " + helper.convertAppleCount(3.4f));
        //Should be 10
        System.out.println("convertAppleCount(10.99) = " + helper.convertAppleCount(10.99f));

        //Should be 17
        System.out.println("countAppleCount(10, 7) = " + helper.countAppleCount(10, 7));
        //Should be 40
        System.out.println("countAppleCount(10, 30) = " + helper.countAppleCount(10, 30));
        //Should be 51
        System.out.println("countAppleCount(50, 1) = " + helper.countAppleCount(50, 1));

        //Should be 9.18
        System.out.println("calculateTotalAppleWeight(1) = " + helper.calculateTotalAppleWeight(1));
    }
}
