class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(char s_char : s.toCharArray()){
            mapS.put(s_char, mapS.getOrDefault(s_char, 0) + 1);
        }

        for(char t_char : t.toCharArray()){
            mapT.put(t_char, mapT.getOrDefault(t_char, 0) + 1);
        }

        return mapS.equals(mapT);
    }
}
