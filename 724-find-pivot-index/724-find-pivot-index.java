class Solution {
    public int pivotIndex(int[] nums) {
        int total=0,left=0,right=0;
        for(int i=0;i<nums.length;i++)
            total=total+nums[i];
        
        
        for(int pivot=0;pivot<nums.length;pivot++){
           // left=left+nums[pivot];
            right=total-left-nums[pivot];
            
        
        if(left==right)
            return pivot;
        
        left=left+nums[pivot];
        }return -1;
    } 
}