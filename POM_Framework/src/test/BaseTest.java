package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;
import mainjava.BaseClass;
import mainjava.DashBoard;
import mainjava.LoginPage;

public class BaseTest extends BaseClass {

	@BeforeClass
	
	public void initbrowser() {
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
	}
	
	
	@BeforeClass
	public void pageObject() {
	loginpage = new LoginPage(driver);
	dashBoard= new DashBoard(driver);
	
	}
	@AfterClass
	public void tearDownEnviroment() {
		driver.quit();
	}
	
	
}
