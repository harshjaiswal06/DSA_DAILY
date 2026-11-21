/*
Problem: Baseball Game
Platform: LeetCode
Problem Link: https://leetcode.com/problems/baseball-game/

Approach:
Use an ArrayList to store the valid scores.
- If the operation is an integer, add it to the list.
- If the operation is "C", remove the last score.
- If the operation is "D", double the last score and add it.
- If the operation is "+", add the sum of the last two scores.

Finally, traverse the ArrayList and calculate the total score.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {

            if (!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+")) {

                arr.add(Integer.parseInt(operations[i]));
            }
            else {
                if (operations[i].equals("C")) {
                    arr.remove(arr.size() - 1);
                }
                else if (operations[i].equals("D") && arr.size() > 0) {
                    arr.add(arr.get(arr.size() - 1) * 2);
                }
                else if (operations[i].equals("+") && arr.size() > 1) {
                    arr.add(arr.get(arr.size() - 1) + arr.get(arr.size() - 2));
                }
            }
        }

        int sum = 0;

        for (int x : arr) {
            sum += x;
        }

        return sum;
    }
}