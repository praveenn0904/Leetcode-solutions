class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int top=0,bottom=m-1;
        int left=0,right=n-1;
        List<Integer>a=new ArrayList<>();
        while(top<=bottom&&left<=right){
        for(int i=left;i<=right;i++){
            a.add(arr[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            a.add(arr[i][right]);
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            a.add(arr[bottom][i]);
        }
        bottom--;
        }
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            a.add(arr[i][left]);
        }
        left++;
        }
        }
        return a;
    }
}