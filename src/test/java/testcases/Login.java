package testcases;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hrm.pages.Homepage;
import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

@RunWith(SerenityRunner.class)
public class Login {
	
	
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

	
	@Steps
	Homepage home;
	
	
	@Test
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		home.verifyTitle();
		home.enterCredentials("Admin", "admin123");
		home.verifyDashboard();
		
		
		
	}

}











