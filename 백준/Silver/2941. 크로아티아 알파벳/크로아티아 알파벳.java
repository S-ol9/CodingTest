import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] starr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i = 0; i < starr.length; i++) { //배열 길이만큼
            if(str.contains(starr[i])) { // 받은 문자열이 배열의 요소를 가지고 있다면
                str = str.replace(starr[i], "0"); // 해당 값으로 대체
            }
        }
        System.out.println(str.length()); // 길이 출력
    }
}