import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr1 = new int[8];
        int[] arr2 = new int[8];

        int sum = 0;

        for (int i = 0; i < 8; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
            arr2[i] = arr1[i];
        }

        Arrays.sort(arr1);

        for (int i = 3; i < 8; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);

        for (int i = 0; i < 8; i++) { // 정렬 되지 않은 배열
            for (int j = 3; j < 8; j++) { // 정렬된 배열 5개
                if (arr2[i] == arr1[j]) { // 같을 경우 해당 인덱스 값 추출
                    System.out.print((i + 1) + " ");
                }
            }
        }
    }
}