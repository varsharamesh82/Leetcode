class Solution {
    public int numIslands(char[][] grid) {
        
        int count=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){ // looping through 2d matrix
                if(grid[i][j]=='1'){
                    count=count+1; // we have come across an island
                    callDFS(grid,i,j);
                }
            }
        }
        return count;
    } 
        public void callDFS(char[][] grid, int i, int j){ 
          if(i<0 || i>=grid.length || j<0 || j>= grid[i].length||grid[i][j]=='0')
    return;
        
            grid[i][j]= '0'; // so basically when you come across the first '1', we make it 0, to avoid confusion in the future
            
            // then we do recursive call, 4 times, for up down left right
            
            callDFS(grid, i+1,j);
            callDFS(grid, i-1,j);
            callDFS(grid, i,j+1);
            callDFS(grid, i,j-1);
        }
    }
