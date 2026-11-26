/*
Problem: Quadratic Roots
Platform: GeeksforGeeks
Problem Link: https://www.geeksforgeeks.org/problems/roots-of-a-quadratic-equation/1

Approach:
Calculate the discriminant using b² - 4ac.
If the discriminant is negative, the roots are imaginary.
Otherwise, calculate both roots using the quadratic formula.
Use Math.floor() to round down the roots and store them in descending order.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here

        ArrayList<Integer> arr=new ArrayList<>();
        int inner=((int)Math.pow(b,2))-(4*a*c);

        if(inner<0){
            System.out.print("Imaginary");
            return new ArrayList<>();
        }

        double inlner=Math.sqrt(inner);
        int positive=(int)Math.floor((-b+inlner)/(2.0*a));

        int negative=(int)Math.floor((-b-inlner)/(2.0*a));

        if(positive>negative){
            arr.add(positive);
            arr.add(negative);
        }
        else{
            arr.add(negative);
            arr.add(positive);
        }

        return arr;

    }
}