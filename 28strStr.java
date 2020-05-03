class Solution {
    public int strStr(String haystack, String needle) {
        int haystack_length = haystack.length();
        int needle_length = needle.length();
        if(needle.isEmpty()) return 0;
        
        for(int i = 0; i<=haystack_length-needle_length; i++){
            for(int j = 0; j< needle_length && haystack.charAt(i+j) == needle.charAt(j); j++){
                if(j == needle_length-1) return i;
            }
        }
        return -1;
        
    }
}
