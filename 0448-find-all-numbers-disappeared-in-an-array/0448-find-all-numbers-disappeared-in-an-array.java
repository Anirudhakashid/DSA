class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }  
    //finding missing numbers
    List<Integer> ans = new ArrayList<>();
    
    for(int j = 0; j<nums.length; j++){
        if(nums[j] != j+1){
            ans.add(j+1);
        }
    }
    return ans;
    }
}   