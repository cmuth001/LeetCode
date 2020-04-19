class 38CountandSay {
    public String countAndSay(int n) {
        
        if(n<0) return null;
        
        String s = "1";
        for(int i = 1; i<n ;i++){
            s = nextString(s);
            
        }
        return s;
    }
    private String nextString(String s){
        String tempStr = "";
        
        for(int i = 0, count = 1; i<s.length(); i++){
            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1))
			{
                count++;
            }
			else
			{
                tempStr = tempStr+count+s.charAt(i);
                
				count = 1;
			}
        }
        return tempStr;
    }
}


// 2nd solution
class Solution {
   public String countAndSay(int n) {
       if(n<1) return null;
       
       String ans = "1", temp ="";
       int j =0;
       while(n>1){
           temp = "";
           for(int i = 0; i<ans.length();){
               j = i+1;
               while(j<ans.length() && ans.charAt(i) == ans.charAt(j)) j++;
               temp = temp + (j - i) + ans.charAt(i);
               i = j;
           }
           ans = temp;
           n--;
       }
       
        return ans;
    }
}


// 3rd solution
class Solution {
   public String countAndSay(int n) {
       StringBuilder ans = new StringBuilder("1");
       
       int j =0;
       while(n>1){
           StringBuilder temp = new StringBuilder();
           for(int i = 0; i<ans.length();){
               j = i+1;
               while(j<ans.length() && ans.charAt(i) == ans.charAt(j)) j++;
               temp.append(j-i).append(ans.charAt(i));
               i = j;
           }
           ans = temp;
           n--;
       }
       
        return ans.toString();
    }
}
