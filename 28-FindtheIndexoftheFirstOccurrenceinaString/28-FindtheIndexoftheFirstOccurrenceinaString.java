// Last updated: 7/21/2026, 9:52:38 AM
1class Solution {
2    public String multiply(String num1, String num2) {
3        if (num1.equals("0") || num2.equals("0")) {
4            return "0";
5        }
6
7        int m = num1.length();
8        int n = num2.length();
9        int[] result = new int[m + n];
10
11        for (int i = m - 1; i >= 0; i--) {
12            for (int j = n - 1; j >= 0; j--) {
13                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
14                int sum = mul + result[i + j + 1];
15
16                result[i + j + 1] = sum % 10;
17                result[i + j] += sum / 10;
18            }
19        }
20
21        StringBuilder sb = new StringBuilder();
22
23        for (int num : result) {
24            if (!(sb.length() == 0 && num == 0)) {
25                sb.append(num);
26            }
27        }
28
29        return sb.toString();
30    }
31}