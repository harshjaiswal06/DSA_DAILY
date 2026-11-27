/*
Problem: 1470. Shuffle the Array
Platform: LeetCode
Problem Link: https://leetcode.com/problems/shuffle-the-array/

Approach:
Split the given array into two halves.
The first half contains x1, x2, ..., xn and the second half contains y1, y2, ..., yn.

Traverse the result array:
- At even indices, insert elements from the first half.
- At odd indices, insert elements from the second half.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {

        int []arr=new int [n];

        int [] arr2=new int[n];

        int [] ans=new int [2*n];

        int ip=1;

        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr2[i]=nums[i+n];
        }

        int first=0;
        int second=0;

        for(int i=0;i<2*n;i++){

            if(i%2==0){
                ans[i]=arr[first];
                first++;
            }
            else{
                ans[i]=arr2[second];
                second++;
            }
        }

        return ans;

    }
}