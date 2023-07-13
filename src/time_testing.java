import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class time_testing {

	public void loop(String setTime) throws InterruptedException {
		while(true) {
		 LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");

	    
		
		String formattedDate = myDateObj.format(myFormatObj);
	  
		if(setTime.equals(formattedDate)) {
		   try {
			new shutdown().shutDown();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  break;
	  }
		}
	}

}
