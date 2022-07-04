class Solution {
    public int longestConsecutive(int[] nums) {
        Set< Integer> HashSet=new HashSet<>();
        
        for(int num:nums){
            HashSet.add(num);
        }
        
        int streak=0;
        
        for(int num:nums){
            if(!HashSet.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;
                
                while(HashSet.contains(currentNum+1)){
                    currentNum=currentNum+1;
                    currentStreak=currentStreak+1;
                }
                streak=Math.max(streak, currentStreak);
            }
        } return streak;
    }
}