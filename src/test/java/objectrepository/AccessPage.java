package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.Hooks;

public class AccessPage {
	public AccessPage() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath = "//table//h3")
	private WebElement customerId;
	public WebElement getCustomerId() {
		return customerId;
	}
	
}
