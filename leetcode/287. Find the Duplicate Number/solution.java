/*
Problem: 287. Find the Duplicate Number
Platform: LeetCode
Approach: HashMap Frequency Counting
Time Complexity: O(n)
Space Complexity: O(n)

Explanation:
Store the frequency of each number in a HashMap.
If a number already exists, increment its frequency.
Then traverse the map and return the number with
the highest frequency.
*/

class Solution {
    public int findDuplicate(int[] nums) {

        HashMap<Integer, Integer> arr = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (!arr.containsKey(nums[i])) {
                arr.put(nums[i], 1);
            } else {
                arr.put(nums[i], arr.get(nums[i]) + 1);
            }
        }

        int val = 0;
        int max = 0;

        for (int key : arr.keySet()) {

            if (arr.get(key) > max) {
                val = key;
                max = arr.get(key);
            }
        }

        return val;
    }
}