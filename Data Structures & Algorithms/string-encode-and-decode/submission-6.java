class Solution {

    public String encode(List<String> strs) {
        String output = "";
        for(String str : strs){
            int length = str.length();
            output += Integer.toString(length);
            output += "#";
            output += str;
        }
        return output;
    }

    public List<String> decode(String str) {
        int l=0;
        int r=1;
        List<String> list = new ArrayList<>();
        while(l < str.length()){
            while(!str.substring(r,r+1).equals("#")){
                r++;
            }
            int value = Integer.valueOf(str.substring(l,r));
            l = r+1;
            r = l+ value;
            list.add(str.substring(l,r));
            l = r;
        }
        return list;
    }
}


