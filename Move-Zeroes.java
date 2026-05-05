1class Solution {
2    public void moveZeroes(int[] nums) {
3        int lastNonZeroIndex = 0;
4
5        // Traverse the array
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] != 0) {
8                // Swap the current non-zero element with the 
9                // element at lastNonZeroIndex
10                int temp = nums[i];
11                nums[i] = nums[lastNonZeroIndex];
12                nums[lastNonZeroIndex] = temp;
13
14                // Move the pointer forward for the next non-zero element
15                lastNonZeroIndex++;
16            }
17        }
18    }
19  }