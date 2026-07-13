class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        char popped = 'E';

        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        for (char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(!stack.isEmpty()){
                    popped = stack.pop();
                }
                if(brackets.get(c) != popped){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
