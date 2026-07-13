class Solution {

    public String encode(List<String> strs) {
        String values = "";
        for(String s : strs){
            values += String.valueOf(s.length());
            values += "#";
            values += s;
        }
        return values;
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        int start = 0;
        int end = 0;
        int value = 0;
        while(end < str.length()){
            String word = "";
            if(start == str.length()){
                return arr;
            }
            while(!(str.substring(start, start+1).equals("#"))){
                start++;
            }
            value = Integer.valueOf(str.substring(end, start));
            end = value + start;
            start += 1;
            while(start < end + 1){
                word += str.substring(start, start+1);
                start += 1;
            }
            arr.add(word);
            end++;
        }
        return arr;
    }
}
