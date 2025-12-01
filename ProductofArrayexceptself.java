class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];

        // Pass 1: Prefix (Left to Right)
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i]; // Update prefix for next turn
        }

        // Pass 2: Postfix (Right to Left)
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= postfix; // Multiply with what we found in Pass 1
            postfix *= nums[i];   // Update postfix for next turn
        }

        return result;
    }
}
    

