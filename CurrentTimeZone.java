import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class CurrentTimeZone {
	public static void main(String[] args){
		CurrentTimeZone aRequest = new CurrentTimeZone();
		aRequest.getLocalTime();
	}
	
	public void getLocalTime(){
	// Get the current date and time
      LocalTime currentTime = LocalTime.now();
      System.out.println("The Current Time Is: " + currentTime);
      
    
	}
}