import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<3; i++) {
            int sh = sc.nextInt();
            int sm = sc.nextInt();
            int ss = sc.nextInt();
            int eh = sc.nextInt();
            int em = sc.nextInt();
            int es = sc.nextInt();

            if(es < ss) {
                es += 60;
                em -= 1;
            }
            es-=ss;

            if(em < sm) {
                em += 60;
                eh -= 1;
            }
            em -= sm;
            eh -= sh;

            System.out.println(eh + " " + em + " " + es + " ");
        }
    }
}