class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            int [] arr = new int[26];
            for(char c : strs[i].toCharArray()){
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
