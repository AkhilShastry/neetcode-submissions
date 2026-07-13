class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(char sC : s.toCharArray()){
            sMap.put(sC, sMap.getOrDefault(sC, 0) + 1);
        }

        for(char tC : t.toCharArray()){
            tMap.put(tC, tMap.getOrDefault(tC, 0) + 1);
        }

        return sMap.equals(tMap);
    }
}
