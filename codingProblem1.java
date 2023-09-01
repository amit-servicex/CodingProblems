/* Online Java Compiler and Editor 

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

 

Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 

Constraints:

0 <= n <= 105
 

Follow up:

It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?

*/
import java.util.Arrays;

public class CountBits {
   int[] ans = new int[n + 1]; // Create an array to store the results
    
    // Loop through numbers from 1 to n
    for (int i = 1; i <= n; i++) {
        // Use dynamic programming to calculate the count of 1's in the binary representation of i
        // ans[i >> 1] represents the count of 1's in the binary representation of i after removing its least significant bit
        // (i & 1) checks if the least significant bit of i is 1 or 0 and adds that to the count
        ans[i] = ans[i >> 1] + (i & 1);
    }
    

    public static void main(String[] args) {
        int n = 5; // You can change this value to any desired integer
        int[] result = countBits(n);
       // System.out.println(Arrays.toString(result));
    }
}




