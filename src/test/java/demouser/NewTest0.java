package demouser;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class NewTest0 {
  WebDriver driver;
  ReadConfigure r;
  Properties p;
  Adduser a;
  Userspage page1;
  @BeforeTest
  public void login() throws InterruptedException {
	  r = new ReadConfigure();
	  p=new Properties();
	  a=new Adduser();
	  page1=new Userspage(driver);
	  a.fetchXpath();
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  
  }
  @Test
  public void urlLogin() throws Exception {
	  driver.get(r.getURL());
	  System.out.println("Email="+a.VEmail);
	  driver.findElement(By.xpath(a.VEmail)).sendKeys(r.getUsername());
	  driver.findElement(By.xpath(a.VContinue)).click();
	  driver.findElement(By.xpath(a.VPassword)).sendKeys(r.getPassword());
	  driver.findElement(By.xpath(a.VContinue)).click();
	  //page1.clickUsersButton();
	  driver.findElement(By.xpath(a.VUser)).click();
	  driver.switchTo().frame("Content");
	  driver.findElement(By.xpath(a.VAddUser)).click();
	  Thread.sleep(20000);
	  driver.findElement(By.xpath(a.VFullName)).sendKeys("abc");
	  driver.findElement(By.xpath(a.VUserName)).sendKeys("abc_def");
	  driver.findElement(By.xpath(a.VNewUserPW)).sendKeys("abcd@123");
	  driver.findElement(By.xpath(a.VDomain)).sendKeys("software");
	  driver.findElement(By.xpath(a.VAddUserEmail)).sendKeys("abcd123@gmail.com");
	  driver.findElement(By.xpath(a.VNewUserPW)).sendKeys("abcd@123");
	 driver.findElement(By.xpath(a.VSaveBtn)).click();
	
  }
  
}
