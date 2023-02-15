package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority = 2, groups = { "smoke", "regression" })
	public void verifyTitleOfLoginPage() {
		String verifytitleofloginpage = loginpage.titleOfLoginPage();
		Assert.assertEquals(verifytitleofloginpage, "Login");
	}

	@Test(priority = 1, groups = { "smoke", "regression" })
	public void verifyurlOfLoginPage() {
		String verifyurlofloginpage = loginpage.urlOfPage();
		Assert.assertEquals(verifyurlofloginpage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority = 3, groups = { "smoke", "regression" })
	public void verifyLoginPagewithcorrectcredential() {
		loginpage.setUserName("Admin");
		loginpage.setPassword("admin123");
		loginpage.clickloginbutton();
		String titleoffdash=dashBoard.titleOfDashboard();
		Assert.assertEquals(titleoffdash, "Dashboard");
	}
	@Test(priority = 0, groups = { "smoke", "regression" })
	public void verifyBuildTitleName() {
		String verifyTitleOfBuild = loginpage.getBuildTitle();
		Assert.assertEquals(verifyTitleOfBuild, "OrangeHRM");
	}
}

