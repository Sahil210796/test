package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	// All the locator of page
	
	@FindBy(xpath="//h5[text()=\"Login\"]")
	WebElement txtLoginPage;
	
	@FindBy(name="username")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Pass;
	
	@FindBy(tagName="button")
	WebElement btnLogin;

	
	//initialization of locator/variable
	
	public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//method required performance test steps
	
	
/* Author : Sahil Shaikh
 * Date : 05 feb 2023
 * Description : This test method is uesd to verify login page time
 * Paramter Return : String
 */
	public String titleOfLoginPage() {
		return txtLoginPage.getText();	
	}
	
	/* Author : Sahil Shaikh
	 * Date : 05 feb 2023
	 * Description : This test method is uesd to verify url of title page
	 * Paramter Return : String
	 */
public String urlOfPage() {
	return driver.getCurrentUrl(); //return string value //for return url of page use this method
}
/* Author : Sahil Shaikh
 * Date : 05 feb 2023
 * Description : This test method is uesd to set usernamevalue
 * Paramter Return : String
*/
public void setUserName(String usserName) {
	UserName.sendKeys(usserName);
}
/* Author : Sahil Shaikh
 * Date : 05 feb 2023
 * Description : This test method is uesd to set passwordvalue
 * Paramter Return : String
*/
public void setPassword(String Password) {
	 Pass.sendKeys(Password);

}
/* Author : Sahil Shaikh
 * Date : 05 feb 2023
 * Description : This test method is uesd to set passwordvalue
 * Paramter Return : String
*/
public void clickloginbutton() {
	btnLogin.click();
}
/* Author : Sahil Shaikh
 * Date : 05 feb 2023
 * Description : This test method is uesd to set passwordvalue
 * Paramter Return : String
*/
public String getBuildTitle() {
	return driver.getTitle();
}
}