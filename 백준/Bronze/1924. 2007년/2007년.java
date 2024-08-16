import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()); // 1~12
        int y = Integer.parseInt(st.nextToken()); // 1~31

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int count = 0;

        for (int i = 0; i < x - 1; i++) {
            count += month[i]; // 입력 받은 달의 월별 일 수 더하기
        }

        count += y; // 입력받은 y의 수 더하기

        System.out.println(days[count % 7]);
    }
}