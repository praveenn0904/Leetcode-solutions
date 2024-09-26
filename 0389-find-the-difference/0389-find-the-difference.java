class Solution {
    public char findTheDifference(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        char c=0;
        for(int i=0;i<a.length;i++)
        c^=a[i];
        for(int i=0;i<b.length;i++)
        c^=b[i];
        return c;
    }
}