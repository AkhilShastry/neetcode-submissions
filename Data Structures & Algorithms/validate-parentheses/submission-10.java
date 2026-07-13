class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for(int j=0; j<s.length(); j++){
            if(s.substring(j, j+1).equals(")")){
                if(stack.isEmpty() || !stack.peek().equals("(")){
                    return false;
                }
                stack.pop();
            }
            else if(s.substring(j, j+1).equals("}")){
                if(stack.isEmpty() || !stack.peek().equals("{")){
                    return false;
                }
                stack.pop();
            }
            else if(s.substring(j, j+1).equals("]")){
                if(stack.isEmpty() || !stack.peek().equals("[")){
                    return false;
                }
                stack.pop();
            }
            else{
                stack.push(s.substring(j, j+1));
            }
        }
        // // HashMap<String, String> map = new HashMap<>();
        // // map.put('(', ')');
        // // map.put('{', '}');
        // // map.put('[', ']');
        // for(int i=0; i<s.length(); i++){
        //     if(s.substring(i, i+1).equals(')')){
        //         stack.pop();
        //         if(!stack.peek().equals('(')){
        //             return false;
        //         }
        //     }

        //     if(s.substring(i, i+1).equals('}')){
        //         stack.pop();
        //         if(!stack.peek().equals('{')){
        //             return false;
        //         }
        //     }

        //     if(s.substring(i, i+1).equals(']')){
        //         stack.pop();
        //         if(!stack.peek().equals('[')){
        //             return false;
        //         }
        //     }
        // }
        return stack.isEmpty();
    }
}
