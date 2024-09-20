class Solution {
    public int lengthOfLastWord(String s) {
        String a=s.trim();
        int len=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            len=0;
            else 
            len++;
        }
        return len;
    }
}