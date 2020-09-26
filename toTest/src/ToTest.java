import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ToTest {

	
				public static void main(String[] args) {
					LocalDate date = LocalDate.now();
					String date2 = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
					System.out.println(date2);
				}
}
