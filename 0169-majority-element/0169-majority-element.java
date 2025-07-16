class Solution {
    public int majorityElement(int[] nums) {
        //applying Moore Voting algorithm
        int element = 0;
        int count = 0;

        for(int num : nums){
            if(count == 0){
                element = num;
                count += 1;
            }else if(num == element){
                count ++;
            }else{
                count --;
            }
        }
        //got the potential ans: element
        //verify it: by searching the array
        int count1 = 0;
        for(int num : nums){
            if(num == element){
                count1 ++;
            }
        }
        if(count1 > (nums.length)/2){
            return element;
        }

        return -1;
    }
}