import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 숫자 카드 개수
        StringTokenizer st = new StringTokenizer(br.readLine()); // 카드에 적혀있는 정수
        arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr); // 이진 탐색, 오름차순 정렬
        int M = Integer.parseInt(br.readLine()); // 가지고 있어야 할 숫자 카드 개수
        st = new StringTokenizer(br.readLine()); // 가지고 있어야 할 정수

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            int start = lowerBound(num);
            int end = upperBound(num);

            sb.append(end - start).append(" ");
        }

        System.out.println(sb);

    }

    // 찾을 값의 첫번째 인덱스
    private static int lowerBound(int num) {
        int startIndex = 0;
        int endIndex = arr.length;
        while (startIndex < endIndex) { // 같아질 때까지 반복
            int mid = (startIndex + endIndex) / 2;
            if (arr[mid] >= num) { // arr[mid]가 더 클 경우, 하한선 찾기
                endIndex = mid;
            } else {
                startIndex = mid + 1;
            }
        }
        return startIndex;
    }

    // 찾을 값의 마지막 인덱스
    private static int upperBound(int num) {
        int startIndex = 0;
        int endIndex = arr.length;
        while (startIndex < endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (arr[mid] > num) {
                endIndex = mid;
            } else {
                startIndex = mid + 1;
            }
        }
        return startIndex;
    }
}