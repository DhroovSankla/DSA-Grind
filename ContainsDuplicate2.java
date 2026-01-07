import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Create a Set to store numbers in the current window of size k
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in the set, we found a duplicate 
            // within distance k
            if (window.contains(nums[i])) {
                return true;
            }
            
            // Add the current element to the set
            window.add(nums[i]);
            
            // If the set size grows larger than k, remove the oldest element
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}