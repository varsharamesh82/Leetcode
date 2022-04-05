class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i=nums.length-1; //i=4
        int []result=new int[nums.length];
        
        while(i>=0)
        {
             //int value = Math.abs(n); absolute value of a number
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
               // nums[left]=nums[right];
                result[i]=nums[left]*nums[left]; 
             left++;
                                             
            }
            
                else
              {   
                 result[i]=nums[right]*nums[right];
                  right--;
                 }
              i--;
                                             
        } return result;
        
    }
}