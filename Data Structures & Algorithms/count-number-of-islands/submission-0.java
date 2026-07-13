class Solution {
    Set<String> visited = new HashSet<>();
    Queue<String> queue = new LinkedList<>();
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        String index = "";
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[r].length; c++){
                index = r + "," + c;
                if(grid[r][c] == '1' && !visited.contains(index)){
                    numIslands++;
                    bfs(r, c, grid);
                }
            }
        }

        return numIslands;
    }

    private void bfs(int row, int col, char [][] grid){
        String index = row + "," + col;
        queue.add(index);
        visited.add(index);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                String node = queue.poll();

                String[] parts = node.split(",");
                int rowC = Integer.parseInt(parts[0]);
                int colC = Integer.parseInt(parts[1]);

                int [][] directions = {{1,0}, {-1,0}, {0,1}, {0, -1}};
                for(int [] dir : directions){
                    int currRow = rowC + dir[0];
                    int currCol = colC + dir[1];
                    String indexStr = "";
                    if(currRow >= 0 && currRow < grid.length && currCol >= 0 && currCol < grid[0].length){
                        indexStr = currRow + "," + currCol;
                        if(grid[currRow][currCol] == '1' && !visited.contains(indexStr)){
                            queue.add(indexStr);
                            visited.add(indexStr);
                        }
                    }
                }
            }
        }
    }
    
}
