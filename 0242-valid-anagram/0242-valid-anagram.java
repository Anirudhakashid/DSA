class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        //store in hashMap
        //countS.getOrDefault(s.chartAt(i),0) give count for charAt(i) else take 0
        for(int i=0; i<s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i),0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i),0) + 1);
        }
        return countS.equals(countT);
    }
}