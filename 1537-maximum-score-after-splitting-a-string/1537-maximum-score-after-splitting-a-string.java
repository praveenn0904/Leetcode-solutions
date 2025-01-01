class Solution {
    public int maxScore(String inputStr) {
        int tot=0;
        int zero=0;
        int one=0;
        int b=Integer.MIN_VALUE;
        for(char ch:inputStr.toCharArray()){
            if(ch=='1')
            tot++;
        }
        for(int i=0;i<inputStr.length()-1;i++){
            if(inputStr.charAt(i)=='0')zero++;
            else one++;
        int c=zero+(tot-one);
        b=Math.max(b,c);
        }
        return b;
   }
 
    }
    