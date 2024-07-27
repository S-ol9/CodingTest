import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        StringBuilder sb = new StringBuilder();

        char[] arr = N.toCharArray();
        Arrays.sort(arr);
        int sum = 0;

        // 각 자릿수의 합 = 3의 배수 => 3의 배수
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i] - '0';
            sum += num;
            sb.append(num); // 오름차순 정렬 뒤부터 반복 가장 큰 수일 수 밖에 없음.
        }

        if (sum % 3 != 0 || arr[0] != '0') {
            System.out.println(-1);
            return;
        }

        System.out.println(sb);

    }
}