class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> words = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            int [] temp = new int[26];
            for(char c : strs[i].toCharArray()){
                temp[c - 'a']++;
            }
            String rep = Arrays.toString(temp);
            if(!words.containsKey(rep)){
                words.put(rep, new ArrayList<>());
            }
            words.get(rep).add(strs[i]);
        }
        List<List<String>> output = new ArrayList<>();
        for(List<String> addValue : words.values()){
            output.add(addValue);
        }

        return output;
    }
}
