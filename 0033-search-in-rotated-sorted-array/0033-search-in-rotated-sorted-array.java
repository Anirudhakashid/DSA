class Solution {

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //pivot not found ie. array not rotated
        if(pivot == -1){
           return binarySearch(nums, target, 0, nums.length - 1);
        }

        //if pivot found
        //if [pivot] == target
        //nums[-1] throws an error
        if( pivot != -1 && nums[pivot] == target ){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }else{
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
        
    }

    public int findPivot(int [] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

        //4 cases
        if( mid < end && nums[mid] > nums[mid+1]){
            return mid;
        }
        if( mid > start && nums[mid] < nums[mid-1]){
            return mid;
        }
        if(nums[mid] <= nums[start]){
            end = mid - 1;
        }else{
            start = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearch(int [] nums, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if (target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }

        }
        return -1;
    }

}