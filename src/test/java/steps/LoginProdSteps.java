package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;

public class LoginProdSteps {
	

@And("user validates captcha image")
public void user_validates_captcha_image() {
 System.out.println("@And -- user validates captcha image");	
}

@And("user enters firstname and lastname")
public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
	/*
	List<List<String>> data = dataTable.asLists();
	//first row and first col
	System.out.println("firstname is " + data.get(0).get(0) +" and lastname is"+ data.get(0).get(1));
	System.out.println("firstname is " + data.get(1).get(0) +" and lastname is"+ data.get(1).get(1));
*/
	
	/*
	List<Map<String, String>> map = dataTable.asMaps();
	
	System.out.println("Firstname is " + map.get(0).get("FirstName") + "LastName is" + map.get(0).get("LastName"));
	System.out.println("Firstname is " + map.get(1).get("FirstName") + "LastName is" + map.get(1).get("LastName"));

*/
	
	
	for(Map<String,String> data: dataTable.asMaps()) {
		System.out.println(data.get("FirstName") + " " + data.get("LastName"));
	}
}




}
