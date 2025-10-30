class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> count = new HashMap<>();

       for(int n: nums){
        count.put(n,count.getOrDefault(n,0)+1);
       }
       return count.entrySet()
           .stream()  //stream of key-value pair
           .sorted((a, b) -> b.getValue() - a.getValue()) //decending order
           .limit(k) //only keep k 
           .mapToInt(Map.Entry::getKey) //converts the stream to just the keys
           .toArray(); //Converts the final stream into an array of integers
    }
}