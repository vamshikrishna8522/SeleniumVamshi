package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataProviders {
	
   @Test(dataProvider = "data")
   public void bokkTicketTest(String from,String to) {
	   System.out.println("From : " +from+ " To : " +to);
   }
   @DataProvider
   public Object[][] data(){
	   
	   Object[][] obj = new Object[3][2];
	   
	   obj[0][0] = " Hyd";
	   obj[0][1] = " Banglore";
	   
	   obj[1][0] = " Hyd";
	   obj[1][1] = " Chennai";
	   
	   obj[2][0] = " Hyd";
	   obj[2][1] = " Kochi";
	return obj;
   }
}
