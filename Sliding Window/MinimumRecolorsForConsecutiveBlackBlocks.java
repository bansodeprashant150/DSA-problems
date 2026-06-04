/*
LeetCode 2379 - Minimum Recolors to Get K Consecutive Black Blocks

Approach:
1. Count white blocks ('W') in the first window of size k.
2. Store that count as the initial answer.
3. Slide the window:
   - Remove the effect of the outgoing character.
   - Add the effect of the incoming character.
4. Keep track of the minimum white count seen.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MinimumRecolorsForConsecutiveBlackBlocks {

    public static int minimumRecolors(String blocks, int k) {
        int whiteCount = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }

        int minOperations = whiteCount;

        // Sliding window
        for (int i = k; i < blocks.length(); i++) {

            // Remove outgoing character
            if (blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }

            // Add incoming character
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }

            minOperations = Math.min(minOperations, whiteCount);
        }

        return minOperations;
    }

    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;

        int result = minimumRecolors(blocks, k);

        System.out.println("Minimum Recolors: " + result);
    }
}
