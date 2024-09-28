class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] pos = { 0, 0 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    pos[0] = i;
                    pos[1] = j;
                    return pos;
                }
            }
        }
        return null;
    }

}