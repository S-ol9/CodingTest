import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hwan = sc.next();
        String doc = sc.next();

        if (hwan.length() >= doc.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}