import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 인원 수 == 창문 수

        int window = 0;

        // 마지막까지 열려있는 창문의 수 == 창문 여닫는 횟수 홀수번 == n의 약수의 개수가 홀수개 == 제곱 수일 경우 ++;
        for(int i = 1; i * i <= N; i++) { // 제곱만
            window++;
        }

        System.out.println(window);
    }
}