class Solution {
    public int myAtoi(String s){
        StringBuilder sb=new StringBuilder("");
        String sss="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }else{
                s=s.substring(i);
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+'){
                sss=String.valueOf(sb);
                if(sss.contains("+")||sss.contains("-"))
                    break;
                else
                    sb.append(s.charAt(i));
            }
            else if(s.charAt(i)=='-'){
                sss=String.valueOf(sb);
                if(sss.contains("+")||sss.contains("-"))
                    break;
                else
                    sb.append(s.charAt(i));
            }
            else if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'
            ||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'){
                sb.append(s.charAt(i));
            }
            else{
                break;
            }
            
        }
        StringBuilder actualStringBuilder = new StringBuilder("");
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='+'){
                if(i==0){
                    actualStringBuilder.append(sb.charAt(i));
                }else{
                    break;
                }
            }else if(sb.charAt(i)=='-'){
                if(i==0){
                    actualStringBuilder.append(sb.charAt(i));
                }else{
                    break;
                }
            }else{
                actualStringBuilder.append(sb.charAt(i));
            }
        }
        if(actualStringBuilder.length()==1){
            if(actualStringBuilder.charAt(0)=='+'){
                return 0;
            }else if(actualStringBuilder.charAt(0)=='-'){
                return 0;
            }
        }
        if(actualStringBuilder.length()==0){
            return 0;
        }
        Long number=0L;
        try{
            number=Long.parseLong(String.valueOf(actualStringBuilder));
        }catch(java.lang.NumberFormatException e){
            String nstring=String.valueOf(actualStringBuilder);
            if(nstring.contains("-")){
                return (int)(-1*(Math.pow(2, 31)));
            }else{
                return (int)(Math.pow(2, 31)-1);
            }
        }
        if(number>(Math.pow(2, 31)-1)){
            return (int)(Math.pow(2, 31)-1);
        }else if(number<(-1*(Math.pow(2, 31)))){
            return (int)(-1*(Math.pow(2, 31)));
        }else{
            int num=Integer.parseInt(String.valueOf(actualStringBuilder));
            return num;
        }
        


    }

    
}