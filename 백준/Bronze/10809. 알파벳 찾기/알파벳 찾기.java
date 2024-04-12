import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arrc = sc.nextLine().toCharArray();
        for(int i = 0; i < 26; i++){
            int temp = -1;
            for(int j = 0; j< arrc.length; j++) {
                if(arrc[j] - 'a' == i) { // 알파벳과 자리 확인
                    temp = j;
                    break;
                }
            }
            System.out.print(temp+ " ");
        }
    }
}