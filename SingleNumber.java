class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            // Apply XOR operation between the current result and the next number
            result ^= num;
        }

        return result;
    }
}