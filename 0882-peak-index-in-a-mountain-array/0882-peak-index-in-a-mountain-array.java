class Solution {

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){

           int center = start + (end - start)/2;

            if(arr[center] > arr[center + 1] ){
                //we are in des part
                end = center;
            }else{
                //we are in asc part
                start = center + 1;
            }
        }    
        return start; 
    }
}