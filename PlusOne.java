class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit is 9, it becomes 0
            digits[i] = 0;
        }
        
        // If we are here, it means all digits were 9
        // We need an extra space at the beginning (e.g., 99 -> 100)
        int[] result = new int[n + 1];
        result[0] = 1; // The rest of the elements default to 0 in Java
        
        return result;
    }
}