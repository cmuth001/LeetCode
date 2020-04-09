class 994RottingOranges {
    public int orangesRotting(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int freshCount = 0;
        Queue<int []> rotten = new LinkedList<>();
        for (int i =0; i<row; i++){
            for (int j = 0; j<col; j++) {
                if (grid[i][j] == 2){
                rotten.add(new int [] {i, j});
                }
                else if (grid[i][j] == 1){
                    freshCount++;
                }
            }
        }
        
        if(freshCount==0) return 0;
        
        int totalMinutes = 0;
        int [][] dir = {{0,1}, {1, 0}, {-1, 0}, {0, -1}};
        while(!rotten.isEmpty()){
            int rottenSize = rotten.size();
            for (int i= 0; i<rottenSize; i++){
              int currrentNode [] = rotten.poll();
                for( int [] d: dir){
                    int x = currrentNode[0] + d[0];
                    int y = currrentNode[1] + d[1];
                    if(x >= row || y >= col || x < 0 || y < 0 || grid[x][y] != 1 ){
                       continue; 
                    }  
                    grid[x][y] = 2;
                    rotten.add(new int[]{x,y});
                    freshCount--;
                
                }
            }
            
            totalMinutes++;
        }
        return freshCount == 0 ? totalMinutes - 1: -1;
            
    }
}
