package leetcode;

import java.util.Arrays;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class x136SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int index = 0;
        while (index < nums.length - 1) {
            if (nums[index] - nums[index + 1] == 0) {
                index = index + 2;
            } else {
                return nums[index];
            }
        }

        return nums[index];
    }
}
