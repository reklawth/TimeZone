import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;

public class MyTimeZone{
	public static void main(String[] args){
	      // Get the current date and time
      LocalDateTime currentTime = LocalDateTime.now();
      System.out.println("Current DateTime: " + currentTime);
      
      	// Get the current ZoneId
      ZoneId currentZone = ZoneId.systemDefault();
      System.out.println("Current Zone: " + currentZone);
      
      
      ZonedDateTime zdt = currentTime.atZone(currentZone);
      ZoneOffset offset = zdt.getOffset();
      int secondsOfHour = offset.getTotalSeconds() % (60 * 60);
      String out = String.format("%s %10s%n", currentZone, offset);
      System.out.printf(out);
      
	}
}