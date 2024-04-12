import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행문자 읽기

        for(int i = 0; i<T; i++) {
            String[] string = sc.nextLine().split(" ");
            int N = Integer.parseInt(string[0]);
            String s = string[1];

            for(char c : s.toCharArray()) { // 문자열 s를 char 타입의 배열로 변환
                System.out.print(String.valueOf(c).repeat(N));
            }
            System.out.println(); // 각 테스트별 줄바꿈
        }
    }
}