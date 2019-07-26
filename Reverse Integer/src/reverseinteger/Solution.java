package reverseinteger;

import java.util.ArrayList;

class Solution {
    public int reverse(int x) {
        ArrayList<Integer> digits = new ArrayList<>();
        
        while (x > 0) {
            int y = x%10;
            digits.add(y);
            x -= y;
            if (x < 10)
                digits.add(x);
            if (x != 0)
                x /=10;
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
        
        return result;
    }
}
