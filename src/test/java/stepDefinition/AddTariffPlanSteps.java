package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectrepository.AddTariffPlanPage;

public class AddTariffPlanSteps {
	@When("the user fill in the valid tariff plan details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_the_valid_tariff_plan_details(String montRent, String freelmin, String freeimin, String freeSmsPack, String localPMin, String interPMin, String smsPerCharges) throws InterruptedException {
		AddTariffPlanPage addtirff=new AddTariffPlanPage();
		Thread.sleep(5000);
		addtirff.getMonthrent().sendKeys(montRent);
		addtirff.getFreelocalMin().sendKeys(freelmin);
		addtirff.getFreeinterMin().sendKeys(freeimin);
		addtirff.getFreesmsPack().sendKeys(freeSmsPack);
		addtirff.getLocalMinCharge().sendKeys(localPMin);;
		addtirff.getInterMinCharge().sendKeys(interPMin);
		addtirff.getSmsPerCharge().sendKeys(smsPerCharges);
	}
	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		AddTariffPlanPage addtirff=new AddTariffPlanPage();

		addtirff.getBtnSubmit1().click();
	}

	@Then("the user should see the success message")
	public void the_user_should_see_the_success_message() {
	    
  AddTariffPlanPage addtirff=new AddTariffPlanPage();
  Assert.assertTrue(addtirff.getMessage().isDisplayed());
	}


}
