package github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pushcodetogit {
	
String [][] data =	{{"Admin","admin1"},
	{"admin","admin123"},
	{"admin12","admin"},
	{"Admin","admin123"}};
	@DataProvider(name="logindata")	
	public String[][] datadriven() {
		return data;
	}
	@Test(dataProvider = "logindata")
	public void Loginwebsite(String Uname,String Pwrd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jerome PC\\Desktop\\Chrome driver Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Uname");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Pwrd");
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		driver.quit();
				}
}