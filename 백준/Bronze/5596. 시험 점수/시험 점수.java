import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mk = 0;
        int ms = 0;
        for(int i = 0; i<4; i++) {
            mk += sc.nextInt();
        }
        for(int i =0; i<4; i++) {
            ms += sc.nextInt();
        }
        System.out.println(Math.max(mk, ms));
    }
}