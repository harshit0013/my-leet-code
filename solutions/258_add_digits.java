// https://leetcode.com/problems/add-digits/

// search Digit Root Principle

class Solution {
    public int addDigits(int num) {
        // if(num / 10 == 0)
        //     return num;
        // int temp = 0;
        // while(num > 0)
        // {
        //     temp = num % 10 + temp;
        //     num = num / 10;
        // }
        // return addDigits(temp);
        if(num == 0)
            return 0;
        if(num % 9 == 0)
            return 9;
        return num % 9;
    }
}
