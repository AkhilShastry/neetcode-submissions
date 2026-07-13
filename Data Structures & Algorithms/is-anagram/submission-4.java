class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(char c : s.toCharArray()){
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }
        return mapT.equals(mapS);
    }
}
