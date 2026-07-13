class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(Character c : s.toCharArray())
            map1.put(c, map1.getOrDefault(c, 0) + 1);

        for(Character p : t.toCharArray())
            map2.put(p, map2.getOrDefault(p, 0) + 1);

        return map1.equals(map2);
    }
}
