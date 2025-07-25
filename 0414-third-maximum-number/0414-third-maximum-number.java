class Solution {
    public int thirdMax(int[] nums) {
    //Using Integer instead of int so they can be set to null
    //skip special-case logic for Integer.MIN_VALUE
    //we are using min_value as test cases are in -100000
        long max = Long.MIN_VALUE;
        long second_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;

        for(int num : nums){
            //Handling dublicates
            //if found continue to next element
            if(num == max || num == second_max || num == third_max){
                continue;
            }

            if(num > max){
            //num is greater than current max → shift all values(3) down.
                third_max = second_max;
                second_max = max;
                max = num;
            }else if( num > second_max){
            //num is greater than second max → shift all values(2) down.
                third_max = second_max;
                second_max = num;
            }else if( num > third_max){
                third_max = num;
            }
        }

    //if 3rd max does not exists return the maximum element (as given in question)
        if(third_max == Long.MIN_VALUE){
            return (int) max;
        }
     // long -> int (typecasting)  
        return (int) third_max;
    }
}