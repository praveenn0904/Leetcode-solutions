class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0,co=0;
        for(int i=1;i<=n;i++)
        sum+=i;
        for(int i=0;i<n;i++)
        co+=nums[i];
        return sum-co;
    }
}