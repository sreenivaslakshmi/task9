package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.Hooks;

public class AddTariffPlanPage {
	public AddTariffPlanPage() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(name = "rental")
	private WebElement monthrent;

	@FindBy(name = "local_minutes")
	private WebElement freelocalMin;
	@FindBy(name = "inter_minutes")
	private WebElement freeinterMin;
	@FindBy(name = "sms_pack")
	private WebElement freesmsPack;
	@FindBy(name = "minutes_charges")
	private WebElement localMinCharge;
	@FindBy(name = "inter_charges")
	private WebElement interMinCharge;
	@FindBy(name = "sms_charges")
	private WebElement smsPerCharge;
	@FindBy(name="submit")
	private WebElement btnSubmit1;
	@FindBy(xpath="//section[@id='main']//h2")
	private WebElement message;
	
	
	
	/*public AddTariffPlanPage() {
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(name = "rental")
	private WebElement monthRent;

	@FindBy(name = "local_minutes")
	private WebElement freeloc_min;

	@FindBy(name = "inter_minutes")
	private WebElement freeinter_min;

	@FindBy(name = "sms_pack")
	private WebElement freesms;

	@FindBy(name = "minutes_charges")
	private WebElement localmin_char;

	@FindBy(name = "inter_charges")
	private WebElement int_char;

	@FindBy(name = "sms_charges")
	private WebElement sms_char;
*/	public WebElement getMonthrent() {
		return monthrent;
	}
	public WebElement getFreelocalMin() {
		return freelocalMin;
	}
	public WebElement getFreeinterMin() {
		return freeinterMin;
	}
	public WebElement getFreesmsPack() {
		return freesmsPack;
	}
	public WebElement getLocalMinCharge() {
		return localMinCharge;
	}
	public WebElement getInterMinCharge() {
		return interMinCharge;
	}
	public WebElement getSmsPerCharge() {
		return smsPerCharge;
	}
	public WebElement getBtnSubmit1() {
		return btnSubmit1;
	}
	public WebElement getMessage() {
		return message;
	}
	
}
