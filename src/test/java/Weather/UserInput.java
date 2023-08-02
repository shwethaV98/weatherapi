package Weather;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner; 

	public class UserInput {
	  public static void main(String[] args) {
	    // Java Scanner String input example
	    System.out.println("Select any number from 0 to 3");
	    API obj = new API();
	    
	    Scanner scanner = new Scanner(System.in);
	    int input= scanner.nextInt();
	    do {
	    	switch(input) {
	    		case 0: 
	    			System.out.println("Input is zero and exit from program");           
	    			System.exit(0);
	    		case 1: 
	    			System.out.println("Input is 1 and please enter valid date. Eg: 2019-03-27 19:00:00 ");   				    			

	    			try {
	    				// Creating a new BufferedReader object to read input from user
	    				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	    				// Reading the string value entered by the user
	    				String strDate = reader.readLine();   				
	    				obj.GetWeather(strDate);
	    				
	    				}catch(Exception e) {
	    				System.out.print("Error: ");
	    				e.printStackTrace();
	    				}
	    				break;
	    			
	    		case 2: 
	    			System.out.println("Input is 2 and please enter valid date. Eg: 2019-03-27 19:00:00");   				    			

	    			try {
	    				// Creating a new BufferedReader object to read input from user
	    				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	    				// Reading the string value entered by the user
	    				String strDate = reader.readLine();   				
	    				obj.GetWindSpeed(strDate);
	    				
	    				}catch(Exception e) {
	    				System.out.print("Error: ");
	    				e.printStackTrace();
	    				}
	    				break;
	    			
	    		case 3: 
	    			System.out.println("Input is 2 and please enter valid date. Eg: 2019-03-27 19:00:00");  
	    			try {
	    				// Creating a new BufferedReader object to read input from user
	    				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	    				// Reading the string value entered by the user
	    				String strDate = reader.readLine();   				
	    				obj.GetPressure(strDate);
	    				
	    				}catch(Exception e) {
	    				System.out.print("Error: ");
	    				e.printStackTrace();
	    				}
	    				break;    			
	    			
	    		default: 
	    			System.out.println("Invalid Input, Please enter any number between 0 to 3");
	    			break;
	    	}}while ((input = scanner.nextInt()) != 0);
	   
	  }

}
