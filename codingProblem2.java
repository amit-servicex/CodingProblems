/* Online Java Compiler and Editor 

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            numToIndex.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two elements add up to the target.");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, -11, 15 };
        int target = -13;
        int[] result = twoSum(nums, target);
       // System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}


/*
 **
Here's how the code works:

Map<Integer, Integer> numToIndex = new HashMap<>();: This map is used to store the numbers encountered in the array along with their indices. The key is the number itself, and the value is the index of that number in the array.
The loop for (int i = 0; i < nums.length; i++) { iterates through the array nums.
Inside the loop:
int complement = target - nums[i];: Calculates the complement of the current number with respect to the target. The complement is the value that, when added to the current number, gives the target.
if (numToIndex.containsKey(complement)) {: Checks if the complement exists in the numToIndex map. If it does, that means we have found a pair of numbers whose sum is equal to the target. In this case, we return the indices of the two numbers as an array.
If the complement is not found in the map, we add the current number to the numToIndex map with its index.
If the loop completes without finding a solution, we throw an exception to indicate that no two elements in the array add up to the target.
The main method demonstrates how to use the twoSum function and prints the indices of the two numbers that add up to the target. You can modify the nums array and the target value as needed.
*/
