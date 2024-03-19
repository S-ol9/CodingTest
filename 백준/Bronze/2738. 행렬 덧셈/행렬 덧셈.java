import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N*M];
        int[] B = new int[N*M];
        for(int i = 0; i<N*M; i++) {
            A[i] = sc.nextInt();
        }
        for(int i =0; i <N*M; i++) {
            B[i] = sc.nextInt();
        }

        int[] answer = new int[N*M];
        for(int i = 0; i < N * M; i++) {
            answer[i] = A[i] + B[i];
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(answer[i * M + j] + " ");
            }
            System.out.println();
        }
    }
    
    // 이차원 배열 사용하기
}
