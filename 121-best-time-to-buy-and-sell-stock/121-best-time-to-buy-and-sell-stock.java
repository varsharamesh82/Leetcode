class Solution {
    public int maxProfit(int[] prices) {
//         int n = Integer.MAX_VALUE;
//         int a=0;
//         int profit=0;
        
//         for(int i=0;i<prices.length;i++){
            
//          // if (prices[i]<n)
//          //     prices[i]=n;
        
//         n= Math.min(n, prices[i]);
//         a=prices[i]-n;
//         profit=Math.max(profit,a);
      
            
//         }
//           return profit;  
        
  //  }

        int maxProfit=0;
        int minPrice= prices[0];
       
        
        for(int i=0;i<prices.length;i++){
            minPrice=Math.min(minPrice,prices[i]);
            int profit= prices[i]-minPrice;
            maxProfit=Math.max(maxProfit, profit);
            
        }
return maxProfit;
    }
}