// Last updated: 7/23/2026, 9:13:22 AM
1import java.util.*;
2class Solution {
3    public String simplifyPath(String path) {
4        Stack<String> stack = new Stack<>();
5        String[] parts = path.split("/");
6        for (String part : parts) {
7            if (part.equals("") || part.equals(".")) {
8                continue;
9            } else if (part.equals("..")) {
10                if (!stack.isEmpty()) {
11                    stack.pop();
12                }
13            } else {
14                stack.push(part);
15            }
16        }
17        if (stack.isEmpty()) {
18            return "/";
19        }
20        StringBuilder result = new StringBuilder();
21        for (String dir : stack) {
22            result.append("/").append(dir);
23        }
24        return result.toString();
25    }
26}