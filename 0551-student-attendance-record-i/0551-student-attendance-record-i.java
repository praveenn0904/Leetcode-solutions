class Solution {
    public boolean checkRecord(String s) {
        char a[]=s.toCharArray();
        int coA=0,coP=0,coL=0;
        for(char i:a){
            if(i=='A')
            {
                coA++;
                coL=0;
            }
            else if(i=='L')
            coL++;
            else
            coL=0;
            if(coA==2||coL==3)
            return false;
        }
        return true;
    }
}