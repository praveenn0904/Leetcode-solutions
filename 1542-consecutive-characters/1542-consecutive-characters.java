class Solution {
    public int maxPower(String s) {
        int max=1,co=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)) co++;
            else
            co=1;
            max=Math.max(max,co);
        }
        return max;
        
    }
}