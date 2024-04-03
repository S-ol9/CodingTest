import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String compare = "";
        for(int i = string.length()-1; i>=0; i--) {
            compare += string.charAt(i);
        }
        if(string.equals(compare)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}