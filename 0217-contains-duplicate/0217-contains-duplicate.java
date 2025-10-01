import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Not the best approach!
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length; i++){
        //     if( i+1 < nums.length && nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;

        //best aaproach: HashSet
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    } 
}