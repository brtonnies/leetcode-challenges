package interview_questions;

import java.util.Stack;
import java.lang.Math;

public class TrappingRainWater {
    public static int trap(int[] height) {
        if (height == null || height.length < 3)
            return 0;

        int res = 0, i = 0;
        Stack<Integer> stack = new Stack<>();

        while (i < height.length) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {

                int top = stack.pop();
                if (stack.empty())
                    break;

                int dist = i - stack.peek() - 1;
                int peekHeight = height[stack.peek()];
                int topHeight = height[top];
                int maxHeight = Math.min(height[i] - topHeight, peekHeight - topHeight);
//                int maxHeight = Math.min(height[i], height[stack.peek()] - height[top]);
                res += dist * maxHeight;
            }
            stack.push(i++);
        }

        return res;

    }
}
