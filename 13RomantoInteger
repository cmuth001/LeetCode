class 13RomantoInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        int sum = map.get(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                sum += map.get(s.charAt(i)) - (2*map.get(s.charAt(i-1)));
            }else{
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
