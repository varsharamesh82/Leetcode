// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//     for (int i = 0; i < nums.length; i++) {
//         if (nums[i] != i) {
//             return i;
//         }
//     }
//     return nums.length;
// }
// }// works


 // class Solution {
 //    public int missingNumber(int[] nums) {
 //        int result=0;
 //             Arrays.sort(nums);
 //    for (int i = 0; i < nums.length; i++) {
 //         if(nums[i+1]-nums[i]!=1)
 //            result= nums[i];
 //    } return result+1;
 // }} // does not work



class Solution {
	public int missingNumber(int[] nums) {
		int sum=0;
		for(int i=0;i<=nums.length;i++)
			sum+=i;

		for(int i=0;i<nums.length;i++)
			sum-=nums[i];

		return sum;
	}
}