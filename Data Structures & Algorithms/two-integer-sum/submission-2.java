class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        int left = 0;
        int right = 1;

        while (left < n - 1) {

            if (nums[left] + nums[right] == target) {
                return new int[]{left, right};
            }

            right++;

            if (right == n) {
                left++;
                right = left + 1;
            }
        }

        return new int[]{};
    }
}