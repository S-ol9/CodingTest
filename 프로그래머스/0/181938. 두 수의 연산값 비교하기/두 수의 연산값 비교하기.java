class Solution {
    public int solution(int a, int b) {
        int num = Integer.parseInt(String.valueOf(a) + String.valueOf((b)));
        int mul = 2 * a * b;
        return Math.max(num, mul) == num ? num : mul;
    }
}