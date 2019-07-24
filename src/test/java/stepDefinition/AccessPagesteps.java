package stepDefinition;

import org.junit.Assert;


import cucumber.api.java.en.Then;
import objectrepository.AccessPage;

public class AccessPagesteps {
	@Then("the user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		AccessPage apage=new AccessPage();
		Assert.assertTrue(apage.getCustomerId().isDisplayed());
	}



}
