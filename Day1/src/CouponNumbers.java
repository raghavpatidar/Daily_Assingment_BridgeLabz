import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CouponNumbers {
    public static void main(String[] args) {
        // Taking input for the number of distinct coupon numbers
        int numberOfCoupons = 5; // You can change this value as needed

        int totalRandomNumbers = generateDistinctCoupons(numberOfCoupons);

        System.out.println("Total random numbers needed to have all distinct coupons: " + totalRandomNumbers);
    }

    public static int generateDistinctCoupons(int numberOfCoupons) {
        Set<Integer> distinctCoupons = new HashSet<>();
        Random random = new Random();
        int totalRandomNumbers = 0;

        while (distinctCoupons.size() < numberOfCoupons) {
            int randomCoupon = random.nextInt(Integer.MAX_VALUE);
            totalRandomNumbers++;

            // Check if the generated coupon is distinct
            if (distinctCoupons.add(randomCoupon)) {
                System.out.println("Generated Coupon: " + randomCoupon);
            }
        }

        return totalRandomNumbers;
    }
}
