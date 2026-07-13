class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            int [] arr = new int[26];
            for(char c : strs[i].toCharArray()){
                arr[c - 'a']++;
            }
            List<Integer> list = Arrays.stream(arr)
                           .boxed()
                           .toList();   
            map.putIfAbsent(list, new ArrayList<>());     
            map.get(list).add(strs[i]);

        }

        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
