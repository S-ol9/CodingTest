class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                answer = answer + "0";
            } else if (rsp.charAt(i) == '0') {
                answer = answer + "5";
            } else { answer = answer + "2"; }
        }
        // char 타입으로 비교하기 위해서는 작은 따옴표로 감싸줘야 한다.
        return answer;
    }
}
