import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest12 {
  
	WebDriver driver;
	@BeforeTest
	public void fun1() {
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
}
