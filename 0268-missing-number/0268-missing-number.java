class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            //here correct index is itself as arr is starting from 0
            int correctIndex = nums[i];
            if( nums[i] < nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
        //search for the missing element
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }
        //case 2: when N is not present in array
        return nums.length;
    }
}