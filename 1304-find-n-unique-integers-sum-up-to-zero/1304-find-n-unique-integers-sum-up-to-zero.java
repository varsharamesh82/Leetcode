class Solution {
    public int[] sumZero(int n) {
        int [] result=new int[n];
        int pos=1;
        int neg=1;
        
        if(n%2==0)
        {
            for(int i=0;i<n/2;i++){
                result[i]=pos++;
                result[i+n/2]=-(neg++);
            }
        }
        else{
            result[0]=0;
            for(int i=1;i<=n/2;i++){
                result[i]=pos++;
                result[i+n/2]=-(neg++);
            }
        }
        return result;
    }
}