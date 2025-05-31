class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int e=n*(n+1)/2;
        int y=0;
        for(int i:nums){
            y+=i;
        }
        return e-y;
    }
}