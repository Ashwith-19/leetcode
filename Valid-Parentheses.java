1 class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stk = new Stack<>();
4
5        for(char ch : s.toCharArray()){
6            if(ch=='(' || ch=='[' || ch == '{'){
7                stk.push(ch);
8            }else{
9            if (stk.isEmpty()) return false;
10            if((stk.peek()=='(' && ch==')') ||(stk.peek()=='[' && ch==']') || (stk.peek()=='{' && ch=='}')){
11                    stk.pop();
12                }else{
13                    return false;
14                }
15            }
16        }
17        return stk.isEmpty();
18    }
19}