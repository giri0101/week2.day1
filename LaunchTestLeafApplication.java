package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTestLeafApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Flipkart");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Giri");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
//driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("LEAD_PARTNER");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/1/98");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("984044789");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gamil.com");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
driver.findElement(By.className("smallSubmit")).click();
	}

}
