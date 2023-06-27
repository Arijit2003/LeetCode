class Solution {
    public  char[]myStack;
    public  int stackIndex=-1;

    public  void push(char c){
        this.stackIndex++;
        this.myStack[this.stackIndex]=c;
    }
    public  void pop(){
        this.stackIndex--;

    }
    
    public  boolean isValid(String s){
        this.myStack=new char[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(this.opening(s.charAt(i))){
                this.push(s.charAt(i));
            }else{
                try{
                    if(this.match(this.myStack[this.stackIndex], s.charAt(i)))
                        this.pop();
                    else{
                        return false;
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    return false;
                }
                
            }
        }
        if(this.stackIndex==-1){
            return true;
        }else{

            return false;
        }
    }
    public boolean opening(char c){
        switch (c) {
            case '(':{
                return true;
            }
            case '{':{
                return true;
            }
            case '[':{
                return true;
            }
        
            default:{
                return false;
            }
        }
    }

    public boolean match(char start,char end){
        if(start=='(' && end==')'){
            return true;
        }else if(start=='[' && end==']'){
            return true;
        }else if(start=='{' && end=='}'){
            return true;
        }else{
            return false;
        }
    }





}