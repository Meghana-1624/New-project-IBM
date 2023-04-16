package demodevice;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demouser.Adduser;
import demouser.ReadConfigure;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
	WebDriver driver;
	  ReadConfigure r;
	  Properties p;
	  Adddevice a;
  @BeforeTest
  public void setup() {
	  r = new ReadConfigure();
	  p=new Properties();
	  a=new Adddevice();
	  a.fetchXpath();
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }
  @Test
  public void login() throws Exception {
	  driver.get(r.getURL());
	  driver.findElement(By.xpath(a.VEmail)).sendKeys(r.getUsername());
	  driver.findElement(By.xpath(a.VContinue)).click();
	  driver.findElement(By.xpath(a.VPassword)).sendKeys(r.getPassword());
	  driver.findElement(By.xpath(a.VContinue)).click();
	  driver.findElement(By.xpath(a.VDevice)).click();
	  driver.switchTo().frame("Content");
	  Thread.sleep(20000);
	  driver.findElement(By.xpath(a.VAdddevice)).click();
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("Content");
	  Thread.sleep(10000);
	  driver.findElement(By.xpath(a.VUsername)).sendKeys("abc_def");
	  driver.findElement(By.xpath(a.VDomain)).sendKeys("software");
	  driver.findElement(By.xpath(a.VDeviceEmail)).sendKeys("abc@gmail.com");
	  driver.findElement(By.xpath(a.VSaveBtn)).click();
	  //System.out.println("text:"+driver.findElement(By.xpath(a.Vtextelement)).getText());
	  driver.findElement(By.xpath("//*[@id=\"common_password\"]/div/div[2]/label")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(a.VsecurityCheckPW)).click();
	  //Alert alert=driver.switchTo().alert();
	  //alert.sendKeys(r.getPassword());
	  driver.findElement(By.xpath(a.VsecurityCheckPW)).sendKeys(r.getPassword());
	  driver.findElement(By.xpath(a.VsecurityCheckSubmit)).submit();
	  
  }
  
}