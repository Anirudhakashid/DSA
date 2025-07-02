class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while(start < end){

            int ans = numbers[start] + numbers[end];

            if(ans > target){
                end--;
            }else if(ans < target){
                start++;
            }else{
                return new int[] {start+1, end+1};
            }
        }
        return new int[] {-1, -1};
    }
}