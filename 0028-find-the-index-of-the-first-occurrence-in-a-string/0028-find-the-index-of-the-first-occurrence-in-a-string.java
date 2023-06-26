class Solution {
    public int strStr(String haystack, String needle) {
//         int index=0,count=0;
//         for(int j=0;j<haystack.length();j++){
//             if(haystack.charAt(j)==needle.charAt(0)){
//                 index=j;//4
//                 count=1;
//                 int iterator=index+1;
//                 for(int i=1;i<needle.length();i++){
//                     try{
//                         if(needle.charAt(i)!=haystack.charAt(iterator)){
//                             break;
//                         }else{
//                             count++;
//                         }
//                     }catch(StringIndexOutOfBoundsException e){
//                         //e.printStackTrace();
//                         //System.out.println("out of index");
//                         return -1;
//                     } 
//                     iterator++;
//                 }
//                 if(count==needle.length())
//                     return index;
//             }  
        
//         }
       
//         return -1;
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            return -1;
        }
        
        
    }
}