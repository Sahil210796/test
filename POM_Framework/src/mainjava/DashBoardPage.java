package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage extends BaseTest{
	
	// All the locator of page
	@FindBy(xpath="//h6[text()='DashBoard']")
	WebElement titleDashboard;
	
	//initialization of locator/variable
public DashBoardPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

	
	
	//method required performance test steps
/* Author : Sahil Shaikh
 * Date : 05 feb 2023
 * Description : This test method is uesd to set passwordvalue
 * Paramter Return : String
*/
public String titleDashboard() {
	return titleDashboard.getText();
}
}
