import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long V = sc.nextLong();
        long answer = (V - B) / (A - B); // 마지막 밤을 빼줌
        // 마지막 밤을 제외하고, 낮까지 올라감.
        if ((V - B) % (A - B) != 0) { // 도착 못하면 하루 추가
            answer++;
        }

        System.out.println(answer);
    }
}