import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        //optimal sol: using 1 hashset
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for(int num : nums2){
            if(set1.contains(num)){
                resultList.add(num);
                set1.remove(num);
            }
        }
        //cant return arrayList as return type is []
        //so converting list to array
        int result [] = new int [resultList.size()]; 
        for(int i=0; i<result.length; i++){
            result[i] = resultList.get(i);
        }
        return result;
    }
}