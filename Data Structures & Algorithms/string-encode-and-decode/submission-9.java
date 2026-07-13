class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for(String str : strs){
            int len = str.length();
            String stringLength = Integer.toString(len);
            encoded += stringLength;
            encoded += "#";
            encoded += str;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        int start = 0;
        int end = 1;
        int length = 0;
        List<String> output = new ArrayList<>();
        while(end < str.length()){
            while(str.charAt(end) != '#'){
                end++;
            }
            length = Integer.valueOf(str.substring(start, end));
            start = end+1;
            end = (start+length);
            output.add(str.substring(start, end));
            start = end;
        }
        return output;
    }
}
