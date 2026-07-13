class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> returnMap = new HashMap<>();
        for(String s : strs){
            int [] rep = new int[26];
            for(char c : s.toCharArray()){
                rep[c -'a']++;
            }
            String val = Arrays.toString(rep);
            returnMap.putIfAbsent(val, new ArrayList<>());
            returnMap.get(val).add(s);
        }
        List<List<String>> output = new ArrayList<>();
        for(List<String> anagrams : returnMap.values()){
            output.add(anagrams);
        }
        return output;
    }
}
