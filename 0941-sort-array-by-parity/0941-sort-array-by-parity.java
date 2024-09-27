class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){
                int te=nums[j];
                nums[j]=nums[i];
                nums[i]=te;
                j++;
            }
        }
        if(nums.length==0)
        return nums;
        return nums;
    }
}