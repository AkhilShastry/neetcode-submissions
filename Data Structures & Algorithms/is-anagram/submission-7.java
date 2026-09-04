class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();

        for(char s_char : s.toCharArray()){
            s_map.put(s_char, s_map.getOrDefault(s_char, 0) + 1);
        }
        for(char t_char : t.toCharArray()){
            t_map.put(t_char, t_map.getOrDefault(t_char, 0) + 1);
        }
        return t_map.equals(s_map);
    }
}
