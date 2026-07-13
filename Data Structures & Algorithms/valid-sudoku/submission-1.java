class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Integer>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> cols = new HashMap<>();
        HashMap<String, HashSet<Integer>> squares = new HashMap<>();
        boolean valid = false;

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] != '.'){
                    int value = board[i][j] - '0';
                    if(value < 1 || value > 9){
                        return valid;
                    }
                    else{
                        rows.putIfAbsent(i, new HashSet<>());
                        cols.putIfAbsent(j, new HashSet<>());
                        int indexR = (i/3);
                        int indexC = (j/3);
                        String indexRC = Integer.toString(indexR) + Integer.toString(indexC);
                        squares.putIfAbsent(indexRC, new HashSet<>());
                        if(rows.get(i).contains(value) || 
                        cols.get(j).contains(value) ||
                        squares.get(indexRC).contains(value)){
                            return valid;
                        }
                        rows.get(i).add(value);
                        cols.get(j).add(value);
                        squares.get(indexRC).add(value);
                    }
                }
            }
        }
        valid = true;
        return valid;
    }
}
