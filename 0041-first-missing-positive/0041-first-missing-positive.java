class Solution {
    public int firstMissingPositive(int[] nums) {
     //Cycle sort:
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            //1st: ignore the negatives
            //2nd: ignore nos > than arr length
            if( nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                //swaping
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length + 1;
    }
}