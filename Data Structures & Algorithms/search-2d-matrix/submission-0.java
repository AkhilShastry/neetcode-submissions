class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;
        int midRow = 0;
        int midCol = 0;
        while(rowStart <= rowEnd){
            midRow = rowStart + (rowEnd-rowStart)/2;
            if(matrix[midRow][0] > target){
                rowEnd = midRow - 1;
            }
            else if(matrix[midRow][matrix[midRow].length-1] < target){
                rowStart = midRow + 1;
            }
            else{
                break;
            }
        }
        if(!(rowStart<=rowEnd)){
            return false;
        }

        while(colStart <= colEnd){
            midCol = colStart + (colEnd-colStart)/2;
            if(matrix[midRow][midCol] < target){
                colStart = midCol + 1;
            }
            else if(matrix[midRow][midCol] > target){
                colEnd = midCol - 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
