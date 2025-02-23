import java.util.*;

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num; // Step 1: XOR all elements
        }

        int diff = xor & -xor; // Step 2: Find rightmost set bit

        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & diff) == 0) {
                num1 ^= num; // XORing one group
            } else {
                num2 ^= num; // XORing the other group
            }
        }

        return new int[]{num1, num2}; // Step 3: The two unique numbers
    }
}
