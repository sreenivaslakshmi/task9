package stepDefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import objectrepository.HomePage;

public class HomePageSteps {
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		HomePage page=new HomePage();
	
		page.getLnk_addCustomer().click();
	}

	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		 
		HomePage page=new HomePage();
		page.getLnk_addTariffPlan().click();

	}


}
