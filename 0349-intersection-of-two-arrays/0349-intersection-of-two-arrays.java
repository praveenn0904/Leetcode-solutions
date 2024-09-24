class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>a=new HashSet<>();
        Set<Integer>b=new HashSet<>();
        for(int num:nums1)
        a.add(num);
        for(int num:nums2)
        b.add(num);
        a.retainAll(b);
        int arr[]=new int[a.size()];
        int i=0;
        for(int num:a)
        arr[i++]=num;
        return arr;
    }
}