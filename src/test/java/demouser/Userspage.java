package demouser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Userspage {

		public WebDriver driver ;

		public Userspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
		By users_btn = By.id("204");
		//By users_check = By.xpath("//tr[1]/td/span/span[@class='linkCont']/span[text()='View'][1]");
		By users_check = By.xpath("//span[text()='View']");
		public void clickUsersButton() throws Exception {
			driver.switchTo().frame("Content");
			//driver.switchTo().defaultContent();
			//driver.findElement(users_btn).click();
			Thread.sleep(10000);
		}
}
