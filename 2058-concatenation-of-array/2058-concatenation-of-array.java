class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        a.add(nums[i]);
        for(int i=0;i<nums.length;i++)
        a.add(nums[i]);
        int arr[]=new int[a.size()];
        for(int i=0;i<a.size();i++){
           arr[i]=a.get(i);
        }
        return arr;
        
    }
}