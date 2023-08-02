package Weather;
import static io.restassured.RestAssured.given;
import java.util.List;
import io.restassured.response.ValidatableResponse;

public class API {
	public static String base_url = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22";
	static ValidatableResponse validatableResponse;

	public void GetWeather(String Date) {
		String inputDate = Date; //System.out.println(inputDate);
		
	    validatableResponse = given().when().get(base_url).then();
	    /*int size = validatableResponse.extract().path("list.size()"); System.out.println("List Size is "+size); */
		
		List<String> date= validatableResponse.extract().path("list.dt_txt"); //System.out.println(date); 		
		
		if(date.contains(inputDate)) {
			//System.out.println(date.contains(inputDate));
			int index = date.indexOf(inputDate);
			//System.out.println("Date index is "+index);
			 Float tempOfInputData = validatableResponse.extract().path("list["+index+"].main.temp");
			 System.out.println("Temp of Input Date " + inputDate + " is " + tempOfInputData);				
		}
		else {
			System.out.println("Weather Input date is not found");	//System.out.println(date.contains(inputDate));
		} 
	}
	
	public void GetWindSpeed(String Date) {
		String inputDate = Date;		
		validatableResponse = given().when().get(base_url).then();
		int size = validatableResponse.extract().path("list.size()"); //System.out.println(size);
		
		List<String> date= validatableResponse.extract().path("list.dt_txt"); //System.out.println(date);
		
		if(date.contains(inputDate)) {
			//System.out.println(date.contains(inputDate));
			int index = date.indexOf(inputDate);
			 float speedValue = validatableResponse.extract().path("list["+index+"].wind.speed");
			 System.out.println("Speed of Input Date " + inputDate + " is " + speedValue);				
		}
		else {
			System.out.println("Wind Input date is not found");//System.out.println(date.contains(inputDate));
		} 
	}
	

	public void GetPressure(String Date) {
		String inputDate = Date;		
		validatableResponse = given().when().get(base_url).then();
		int size = validatableResponse.extract().path("list.size()"); //System.out.println(size);
		
		List<String> date= validatableResponse.extract().path("list.dt_txt"); //System.out.println(date);
		if(date.contains(inputDate)) {
			//System.out.println(date.contains(inputDate));
			int index = date.indexOf(inputDate);
			 Float pressureValue = validatableResponse.extract().path("list["+index+"].main.pressure");
			 System.out.println("Pressure of Input Date " + inputDate + " is " + pressureValue);				
		}
		else {
			System.out.println("Pressure Input date is not found");	//System.out.println(date.contains(inputDate));
		} 
	}

}
