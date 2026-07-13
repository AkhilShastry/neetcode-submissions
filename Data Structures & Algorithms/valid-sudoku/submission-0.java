class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> square = new HashMap<>();
        for(int n= 0; n<board.length; n++){
            cols.put(n, new HashSet<>());
            rows.put(n, new HashSet<>());
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] != '.'){
                    
                    if(cols.get(j).contains(board[i][j])){
                        return false;
                    }
                    else{
                        cols.get(j).add(board[i][j]);
                    }

                    if(rows.get(i).contains(board[i][j])){
                        return false;
                    }
                    else{
                        rows.get(i).add(board[i][j]);
                    }

                    String key = "";
                    key += String.valueOf(i/3);
                    key += String.valueOf(j/3);
                    square.putIfAbsent(key, new HashSet<>());
                    if(square.get(key).contains(board[i][j])){
                        return false;
                    }
                    else{
                        square.get(key).add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}
