class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = {"a", "e", "i", "o", "u"};
        for(int i = 0; i < my_string.length(); i++) {
            boolean isTrue = false; // boolean으로 참, 거짓 따지기
            for(int j = 0; j < arr.length; j++) {
                if(String.valueOf(my_string.charAt(i)).contains(arr[j])) {
                    isTrue = true; // 만약 포함하면 true 값으로 바꾼 뒤 false
                    break;
                }
            }
            if (!isTrue) { // false이면 즉, 포함하지 않으면
                answer = answer + my_string.charAt(i);
            }
        }
        return answer;
    }
}