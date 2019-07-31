package reverseinteger;

import java.util.ArrayList;

class Solution {
    public int reverse(int x) {
        ArrayList<Integer> digits = new ArrayList<>();
        int n = x;
        
        while (n > 0) {
            int y = n%10;
            digits.add(y);
            n -= y;
            if (n < 10)
                digits.add(n);
            if (n != 0)
                n /=10;
        }
        
        int result = 0;
        for (int i = 0; i < digits.size() - 1; i++) {
            if (i == 0)
                result = digits.get(i);
            else {
                result *= 10;
                result += digits.get(i);
            }
        }
        
        if (x < 0)
        	return result * -1;
        
        return result;
    }
}
