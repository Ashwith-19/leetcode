1 class Solution {
2
3    public int romanToInt(String s) {
4
5        int sm = 0;
6
7        for(int i = 0;i<s.length();i++){
8
9            int cur = val(s.charAt(i));
10
11            if(i<s.length()-1&&cur<val(s.charAt(i+1))) sm-= cur;
12            else sm += cur;
13
14        }
15
16        return sm;
17    }
18
19    private int val(char c){
20
21        switch(c){
22            case 'I' : return 1;
23            case 'V' : return 5;
24            case 'X' : return 10;
25            case 'L' : return 50;
26            case 'C' : return 100;
27            case 'D' : return 500;
28            default : return 1000;
29
30        }
31    }
32}