class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String t : tokens){
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int token_one = stack.pop();
                int token_two = stack.pop();
                if(t.equals("+")){
                    stack.add(token_one + token_two);
                }
                else if(t.equals("-")){
                    stack.add(token_two - token_one);
                }
                else if(t.equals("*")){
                    stack.add(token_one * token_two);
                }
                else{
                    stack.add(token_two / token_one);
                }
            }
            else{
                stack.add(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}
