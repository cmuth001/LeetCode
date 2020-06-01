// Brute Force Time limit exceeds
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        
        int sign = (dividend<0) ^ (divisor<0)?-1:1;
        int result = 0;
        long x = Math.abs((long)dividend);
        long y = Math.abs((long)divisor);
        while(x>=y){
            x = x-y;
            result++;
        }
        return result*sign;
        
    }
}

// 2nd method-maximum divisor power
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        
        int sign = (dividend<0) ^ (divisor<0)?-1:1;
        int result = 0;
        
        long x = Math.abs((long)dividend);
        long y = Math.abs((long)divisor);
        
        while(x-y>=0){
            int count = 0;
            while(x-(y<<1<<count)>=0){
                count++;
            }
            result += 1<<count;
            x = x - (y<<count);
        }
        return result*sign;
        
    }
}
