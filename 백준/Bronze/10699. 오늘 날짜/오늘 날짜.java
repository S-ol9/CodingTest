import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String now = sd.format(date);
        System.out.println(now);
    }
    
    // 날짜 포맷 지정할 떄 월을 나타내기 위해서 대문자 MM 사용
}