import DeliveryFeeChallenge.DeliveryFeeChallenge;

public class Main {
    public static void main(String[] args) {
        int[] intervals = new int[]{0, 10, 22};
        int[] fees = new int[]{1, 3, 1};
        int[][] deliveries = new int[][]{{8, 15}, {12, 21}, {15, 48}, {20, 17}, {23, 43}};

        boolean result = DeliveryFeeChallenge.Solution(intervals, fees, deliveries);
        System.out.println(result);

        intervals = new int[]{0};
        fees = new int[]{1};
        deliveries = new int[][] {{12, 34}, {14, 45}, {17, 58}, {23, 25}};
        result = DeliveryFeeChallenge.Solution(intervals, fees, deliveries);
        System.out.println(result);


        intervals = new int[]{0, 5, 15};
        fees = new int[]{6, 10, 8};
        deliveries = new int[][] {
                {3, 32}, {4, 33}, {4, 58},
                {6, 25}, {10, 25}, {11, 25}, {14, 25}, {14, 45},
                {16, 30}, {17, 40}, {18, 20}, {19, 20}
        };
        result = DeliveryFeeChallenge.Solution(intervals, fees, deliveries);
        System.out.println(result);
    }
}