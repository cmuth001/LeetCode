class 3LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<Character>();
        int l = s.length();
        while(i<l && j <l){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j - i);
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}
