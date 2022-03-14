class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm

        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i : nums) {
            maxEndingHere = maxEndingHere + i;

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}