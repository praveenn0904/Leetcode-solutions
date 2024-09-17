class Solution {
    public boolean isThree(int n) {
        int co=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0) co++;
        }
        if(co==3)
        return true;
        else
        return false;
    }
}