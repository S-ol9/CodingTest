import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = sc.nextInt();
        String[] arr= new String[str.length()];

        for(int j =0; j<str.length(); j++) {
            arr[j] = String.valueOf(str.charAt(j));
        }
        System.out.println(arr[i-1]);
    }
}