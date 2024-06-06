package DeliveryFeeChallenge;

public class DeliveryFeeChallenge {

    public static int covertTimeToMinute(int hour, int minute) {
        int result = hour * 60 + minute;
        return result;
    }

    public static boolean Solution(int[] intervals, int[] fees, int[][] deliveries) {
        int j = 0;
        int totalDeliveryTimes = 0;
        int len = intervals.length;
        int prevDeliveryRate = -1;

        for(int i = 0; i < len && j < deliveries.length; i++) {
            int startTime = covertTimeToMinute(intervals[i], 0);
            int endTime;
            if(i == len - 1)
                endTime = covertTimeToMinute(23, 59);
            else
                endTime = covertTimeToMinute(intervals[i + 1] - 1, 59);

            int deliveryTime = covertTimeToMinute(deliveries[j][0], deliveries[j][1]);

            while (deliveryTime >= startTime && deliveryTime <= endTime) {
                totalDeliveryTimes++;
                j++;
                if(j == deliveries.length) break;
                deliveryTime = covertTimeToMinute(deliveries[j][0], deliveries[j][1]);
            }

            int deliveryRate = fees[i] / totalDeliveryTimes;
            if(prevDeliveryRate != -1 && prevDeliveryRate != deliveryRate) {
                return false;
            }
            else {
                prevDeliveryRate = deliveryRate;
            }

            totalDeliveryTimes = 0;
        }

        return true;
    }
}
