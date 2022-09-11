package Kite1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehome {
@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;

public Kitehome(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public String verifyuserID() {
	String actID=userID.getText();
	return actID;
	
}
}
