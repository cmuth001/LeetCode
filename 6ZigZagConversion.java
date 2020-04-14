class 6ZigZagConversion {
    public String convert(String s, int numRows) {
        
        if(numRows<2) return s;
        
        int length = s.length();
        List<StringBuilder> rows = new ArrayList<>();
        String zigzag = "";
        int min = Math.min(numRows, length);
        
        for(int i = 0; i <= min; i++){
            rows.add(new StringBuilder());
        }
        
        int curRow = 0;
        Boolean goingDown = false;
        for(char ch: s.toCharArray()){
            rows.get(curRow).append(ch);
            if(curRow == 0 || curRow == (min-1)){
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }
        for(int i =0; i<min; i++){
            zigzag +=rows.get(i);
        }
        return zigzag;
    }
}
