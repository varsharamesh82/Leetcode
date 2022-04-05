class Solution {
    public int removeDuplicates(int[] nums) {
        //nums-ascending order, unique elements once, order is the same
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;}
        } return index;
    }
}