class Solution {
    public int maxProduct(int[] nums) {
      // -ve, 0 to be taken into consideration
        
        int l=1,r=1;
        int ans=nums[0];
        
        for(int i=0;i<nums.length;i++){
            
            l=l==0? 1:l;
            r=r==0? 1: r;
            
            l=nums[i]*l;
            r=nums[nums.length-i-1]*r;
            
            ans=Math.max(ans, Math.max(l,r));
        }
        return ans;
    }
}