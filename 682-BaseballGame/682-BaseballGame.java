// Last updated: 7/17/2026, 2:57:34 PM
import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop();
            }
            else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            }
            else if (op.equals("+")) {
                int first = stack.pop();
                int second = stack.peek();

                stack.push(first);
                stack.push(first + second);
            }
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}