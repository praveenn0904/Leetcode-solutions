class Solution {
    public int waysToSplitArray(int[] nums) {
        long left=0,right=0;
        for(int i:nums){
            right+=i;
        }
        int co=0;
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            right-=nums[i];
            if(left>=right)
            co++;
        }
        return co;
    }
}