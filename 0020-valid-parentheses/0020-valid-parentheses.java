class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> char_open = new HashSet<>();
        char_open.add('('); char_open.add('{'); char_open.add('[');
        for(char ch:s.toCharArray()){
            if(char_open.contains(ch))stack.push(ch);
            else if(!check(ch,stack))return false;
        }
        if(!stack.isEmpty())return false;
        return true;
    }
    public boolean check(char ch,Stack<Character>stack){
        switch(ch){
            case ')':{
                while(!stack.isEmpty() &&stack.peek()!='(') return false;
                if(stack.isEmpty())return false;
                stack.pop();
                break;
            }
            case '}':{
                if(!stack.isEmpty() &&stack.peek()!='{') return false;
                if(stack.isEmpty())return false;
                stack.pop();
                break;
            }
            case ']':{
                if(!stack.isEmpty() &&stack.peek()!='[')return false;
                if(stack.isEmpty())return false;
                stack.pop();
                break;
            }
        }
        return true;
    }
}