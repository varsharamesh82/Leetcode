class Solution {
    public int maxProfit(int[] prices) {
        int sell=Integer.MIN_VALUE;
        int held=Integer.MIN_VALUE;
        int rest=0;
          
        for(int i:prices) {
            int PrevSold=sell;
            sell=held+i;
            held=Math.max(held,rest-i);
            rest=Math.max(rest,PrevSold);
            
        }
return Math.max(sell,rest);
    }
}