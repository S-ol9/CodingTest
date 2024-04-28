import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            if (check(word)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean check(String str) {
        // boolean형 배열에 초기값이 없으면 모두 false
        boolean[] arr = new boolean[26]; // 알파벳 개수만큼
        int prev = -1; // 이전 문자 인덱스 값
        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            if (prev != now) { // 같지 않음
                if (arr[now - 97] == false) { // 처음 나온 값일 경우
                    arr[now - 97] = true;
                    prev = now;
                } else { // 이전과 현재 값이 같지는 않으나 값이 나왔던 경우
                    return false;
                }
            } else { // 이전 값과 현재 값이 같은 경우
                continue; // 반복문 계속
            }
        }
        return true;
    }
}