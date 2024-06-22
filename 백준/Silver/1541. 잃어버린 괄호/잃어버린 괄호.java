import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 최솟값 => 가장 큰 값을 만들어서 빼야 한다.
        // - 기준으로 나누기
        int answer = 0;
        String[] splitStr1 = br.readLine().split("-");
        for (int i = 0; i < splitStr1.length; i++) {
            int sum = 0;
            
            // i구간에 있는 값만 +기준으로 나누고 2번째 배열 생성
            String[] splitStr2 = splitStr1[i].split("\\+");
            for (int j = 0; j < splitStr2.length; j++) {
                // 각각의 값을 더함
                sum += Integer.parseInt(splitStr2[j]);
            }
            // i = 0일때 무조건 양수이므로 더해줘야 함
            if (i == 0) {
                answer += sum;
            } else {
                // - 기준으로 나눴으므로 더한 값을 다 빼주어야 함
                answer -= sum;
            }

        }
        System.out.println(answer);
    }
}