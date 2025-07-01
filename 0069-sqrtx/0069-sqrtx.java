class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/2;

            if((long)mid*mid > x){
                end = mid - 1;
            }else if((long)mid*mid < x){
                start = mid + 1;
                ans = mid;
            }else{
                return mid;
            }
        }

        return ans;
    }
}