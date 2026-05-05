1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x < 0 || (x % 10 == 0 && x != 0)) {
4            return false;
5        }
6        int revertedNumber = 0;
7        while (x > revertedNumber) {
8            revertedNumber = revertedNumber * 10 + x % 10;
9            x /= 10;
10        }
11        return x == revertedNumber || x == revertedNumber / 10;
12    }
13}