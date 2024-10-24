import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        date.minusHours(9);

        StringBuilder sb = new StringBuilder();
        sb.append(date.getYear()).append("\n");
        sb.append(date.getMonthValue()).append("\n");
        sb.append(date.getDayOfMonth());
        System.out.println(sb);
    }
}