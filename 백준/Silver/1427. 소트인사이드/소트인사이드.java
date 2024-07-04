import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] A = new int[str.length()];
        for(int i = 0 ; i < A.length; i++) {
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }

        // 선택 정렬
        for(int i = 0 ; i < A.length; i++) {
            int max = i; // 인덱스
            for(int j = i+1; j < A.length; j++) {
                // 최댓값 찾기
                if(A[j] > A[max]) {
                    max = j;
                }
            }
            
            if(A[i] < A[max]) {
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }

        for(int i : A) {
            System.out.print(i);
        }
    }
}