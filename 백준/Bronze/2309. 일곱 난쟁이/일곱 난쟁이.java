import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            arr.add(n);
            sum += arr.get(i);
        }

        Collections.sort(arr);
        int a = 0, b = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (sum - arr.get(i) - arr.get(j) == 100) {
                    a = arr.get(i);
                    b = arr.get(j);
                    break;
                }
            }
        }
        
        // remove는 두 가지 방식으로 오버로드 되어있음
        arr.remove(Integer.valueOf(a));
        arr.remove(Integer.valueOf(b));
        
        for (int i : arr) {
            System.out.println(i);
        }
    }
}