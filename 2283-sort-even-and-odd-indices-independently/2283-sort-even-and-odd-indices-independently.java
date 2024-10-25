class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        int co=0,c1=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                a.add(nums[i]);
                co++;
            }
            else
            {
                b.add(nums[i]);
                c1++;
            }

        }
        Collections.sort(a);
        Collections.sort(b,Collections.reverseOrder());
        int e=0,o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
            nums[i]=a.get(e++);
            else
            nums[i]=b.get(o++);
        }
        return nums;
    }
}