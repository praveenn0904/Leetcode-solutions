class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int mini=arr[0],profit=0;
        int maxprofit=0;
        for(int i=1;i<n;i++){
           profit=arr[i]-mini;
           maxprofit=Math.max(maxprofit,profit);
           mini=Math.min(arr[i],mini);
        }
        return maxprofit;
    }
}