class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int a=0,b=1;
        while(b<nums.length)
        {
            int te=nums[a];
            nums[a]=nums[b];
            nums[b]=te;
            a=b+1;
            b=a+1;
        }
        return nums;
    }
}