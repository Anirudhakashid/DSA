class Solution {
    public int countNegatives(int[][] grid) {
        
        int m = grid.length;  //total rows
        int n = grid[0].length; // total cols

        int r = m - 1;
        int c = 0; // 0th col
        int count = 0;

        while(r >= 0 && c < n){
            if(grid[r][c] < 0 ){
                //all the elements in that row are negative
                count += (n - c); 
                r--;
            }else{
                c++;
            }
        } 
        return count;
    }
}