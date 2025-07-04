class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m*n-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            int midElement = matrix[mid/n][mid%n];

            if(midElement < target){
                start = start + 1;
            }else if(midElement > target){
                end = mid - 1;
            }else{
                return true;
            }
        }

        return false;
        
    }
}