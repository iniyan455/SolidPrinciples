import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Test {
    public void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("D", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        System.out.println(sdf.format(calendar.getTime()));
    }
}
