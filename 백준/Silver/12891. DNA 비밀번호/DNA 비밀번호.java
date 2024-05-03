import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] pwd = new int[4]; // 비밀번호 체크 배열
    static int[] mypwd = new int[4]; // 현재 내 비밀번호 배열
    static int check = 0; // 비밀번호 충족 확인 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] string = br.readLine().toCharArray(); // 받을 문자열
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            pwd[i] = Integer.parseInt(st.nextToken());
            if (pwd[i] == 0) {
                check++; // 0이면 고려 안해도 될 사항
            }
        }
        for (int i = 0; i < P; i++) { // 부분 문자열
            Add(string[i]);
        }

        if (check == 4) {
            answer++;
        }

        // 슬라이딩 윈도우
        for (int i = P; i < S; i++) { // end_idx
            int j = i - P; // start_idx
            Add(string[i]); // 들어가는 값 추가 : end_idx
            Remove(string[j]); // 빠져나온 값 삭제 : start_idx
            if (check == 4) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static void Remove(char c) {
        switch (c) {
            case 'A':
                if (mypwd[0] == pwd[0]) check--; // 같았다면 체크 값 변경
                mypwd[0]--; // 값 변경
                break;
            case 'C':
                if (mypwd[1] == pwd[1]) check--;
                mypwd[1]--;
                break;
            case 'G':
                if (mypwd[2] == pwd[2]) check--;
                mypwd[2]--;
                break;
            case 'T':
                if (mypwd[3] == pwd[3]) check--;
                mypwd[3]--;
                break;
        }
    }

    public static void Add(char c) {
        switch (c) {
            case 'A':
                mypwd[0]++; // 내 비밀번호 값 증가
                if (mypwd[0] == pwd[0]) check++; // 같으면 체크
                break;
            case 'C':
                mypwd[1]++;
                if (mypwd[1] == pwd[1]) check++;
                break;
            case 'G':
                mypwd[2]++;
                if (mypwd[2] == pwd[2]) check++;
                break;
            case 'T':
                mypwd[3]++;
                if (mypwd[3] == pwd[3]) check++;
                break;
        }
    }
}
