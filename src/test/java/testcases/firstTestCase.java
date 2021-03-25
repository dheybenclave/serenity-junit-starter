package testcases;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

@RunWith(SerenityRunner.class)
public class firstTestCase extends PageObject {

	@Managed
	WebDriver driver;

	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	@Before
	public void setupTest() {
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void googleSearch() {

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Serenity Serarch", Keys.ENTER);
		$(By.name("q")).typeAndEnter("Serenity Search");
			
		
	}

}

























