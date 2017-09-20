import java.text.SimpleDateFormat;
import java.util.Date;



public class TimeTest {
public static void main(String[] args) {
	
	long time=System.currentTimeMillis();
	time=-62170185600000l;
	SimpleDateFormat format=new SimpleDateFormat("y-M-d H:m:s");
	String date=format.format(new Date(time));
	System.out.println(date);
    

	
	
	
}
}
