import java.time.Clock;  
import java.time.Duration;  
public class time {  
public static void main(String[] args) {  
    Clock c = Clock.systemUTC();  
    Duration d = Duration.ofHours(5);  
    Clock clock = Clock.offset(c, d);    
System.out.println(clock.instant());  
  }  
}  
