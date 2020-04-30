class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('  || s.charAt(i) == '{'  || s.charAt(i)  == '['){
                stack.push(s.charAt(i) );
            }else{
                Character cb = s.charAt(i);
                if(cb == ')'){
                    if(stack.empty()) return false;
                    if(stack.pop() == '('){
                        continue;
                    }else{
                        return false;
                    }
                }
                if(cb == '}'){
                    if(stack.empty()) return false;
                    if(stack.pop() == '{'){
                        continue;
                    }else{
                        return false;
                    }
                }
                if(cb == ']'){
                    if(stack.empty()) return false;
                    if(stack.pop() == '['){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
            
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}
