package Kite1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage2 {
@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement cntBtn;

//initiazation//
public Kiteloginpage2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//utilization//
public void enterpin(String pinvalue) {
	PIN.sendKeys(pinvalue);
}
public void clickcntBtn() {
	cntBtn.click();
}
}
