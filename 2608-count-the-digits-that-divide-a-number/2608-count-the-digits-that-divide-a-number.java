class Solution {
    public int countDigits(int num) {
        int co=0,quo=num,rem;
        while(num!=0)
        {
           rem=num%10;
           if(rem!=0&&quo%rem==0)
           co++; 
           num=num/10;
        }
        return co;
    }
}