/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peakIndex = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnosticBinarySearch(target, mountainArr, 0, peakIndex);

        if(firstTry != -1){
            return firstTry;
        }
        
        return orderAgnosticBinarySearch(target, mountainArr, peakIndex + 1, mountainArr.length()-1 );
    }

    public int peakIndexInMountainArray(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;

        while(start < end){
            int center = start + (end - start)/2;

            if(mountainArr.get(center) > mountainArr.get(center + 1)){
                // we are in des part of array
                end = center;
            }else{
                //we are in asc part of array
                start = center + 1;
            }
        }
        return start;
    }

    public int orderAgnosticBinarySearch(int target, MountainArray mountainArr, int start, int end ){

        //find whether the array is asc or des
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

       while(start <= end){
        int center = start + (end - start)/2;

        if(mountainArr.get(center) == target ){
            return center;
        }

        if(isAsc){
            if(target < mountainArr.get(center)){
                end = center - 1;
            }else{
                start = center + 1;
            }
        }else{
            if(target > mountainArr.get(center)){
                end = center - 1;
            }else{
                start = center + 1;
            }
        }

       }

        return -1;
    }
}