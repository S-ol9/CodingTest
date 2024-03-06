class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        // A - Z : 65 ~ 90
        // a - z : 97 ~ 122
        // String은 조작 불가, char로 조작
        
        for(int i=0; i<arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else if (arr[i] >= 97 && arr[i] <= 122) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        answer = answer + arr[i];
        }
        return answer;
    }
}