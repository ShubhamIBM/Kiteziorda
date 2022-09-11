package Kite1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage1 {
@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement loginbtn;

//initialization//
public Kiteloginpage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//utilization
public void enterUN(String username) {
	UN.sendKeys(username);
}
public void enterpassword(String password) {
	PWD.sendKeys(password);
}
public void clikLOGINBTN() {
	loginbtn.click();
}
}
