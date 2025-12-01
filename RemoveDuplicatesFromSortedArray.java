import java.util.*;

class Solution {
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;

        for (int i = 0; i< nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[idx++] = nums[i];
            }
        }

        return idx;
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,2,2,3,3,4,4,4,4,4};
        int newArr = removeDuplicates(nums);

        for(int i = 0;i< newArr;i++) {
            System.out.print(nums[i] + " ");
        }
    }
}