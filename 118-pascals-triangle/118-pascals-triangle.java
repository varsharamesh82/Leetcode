class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result = new ArrayList<>();
        List<Integer> current_row;
       // prev_row=0;
        for (int i=0;i<numRows;i++){
            current_row=new ArrayList<>();
            for (int j=0;j<=i;j++){
                if(j==0 || j==i)
                    current_row.add(1);
                else
                    current_row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
 
                
            }     result.add(current_row);  
        } return result;
    }
}