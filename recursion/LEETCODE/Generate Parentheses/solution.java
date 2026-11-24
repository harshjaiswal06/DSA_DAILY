/*
Problem: Generate Parentheses
Platform: LeetCode
Approach: Backtracking (Recursion)
Time Complexity: O(4^n / sqrt(n))
Space Complexity: O(n) Auxiliary Space (excluding output)

Explanation:
Use recursion to generate combinations of opening and closing
parentheses. Add an opening parenthesis while its count is less
than n, and add a closing parenthesis only when it doesn't
exceed the opening parenthesis count. When both counts reach n,
add the generated string to the result list.
*/

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> st = new ArrayList<>();

        recursion(st, n, 0, 0, "");

        // ArrayList is a reference type in Java. When we pass it to a recursive function, each call gets a copy of the reference pointing to the same list. Therefore, changes made using add() are reflected in the original list, and we don't need to return the list from every recursive call.

        return st;
    }

    public static void recursion(List<String> st, int n, int p1, int p2, String ans) {

        if (p1 == n && p2 == n) {

            st.add(ans);

            return;
        }

        if (p1 < p2 || p1 > n || p2 > n) {
            return;
        }

        recursion(st, n, p1 + 1, p2, ans + "(");

        recursion(st, n, p1, p2 + 1, ans + ")");
    }
}