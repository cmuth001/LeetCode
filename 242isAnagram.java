class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==0 && t.length() == 0) return true;
        if(s.length()==0 || t.length() == 0) return false;
        char[] cas = s.toCharArray();
        Arrays.sort(cas);
        char[] cat = t.toCharArray();
        Arrays.sort(cat);
        
        return Arrays.equals(cas, cat);
        
        
    }
}
