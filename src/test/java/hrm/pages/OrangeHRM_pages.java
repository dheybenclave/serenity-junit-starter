package hrm.pages;


import org.openqa.selenium.By;

import junit.framework.*;
import net.serenitybdd.core.pages.PageObject;

public class OrangeHRM_pages extends PageObject {
	
	public String title ;
	public String currUrl;

	public void verifyTitle() {
		System.out.println("Verify Title ");
		
		title = getDriver().getTitle();
		Assert.assertTrue(title.contains("OrangeHRM"));
		
	};
	
	public void setUsernamePassword( String username,  String password) {
			
		System.out.println("Setup The Credentials");
		
		$(By.id("txtUsername")).typeAndTab(username);
		$(By.id("txtPassword")).typeAndEnter(password);
		
	};
	
	public void verifyLogin() {
		
		System.out.println("Verify Dashboard - Login : true ");
		
		currUrl = getDriver().getCurrentUrl();
		Assert.assertTrue(currUrl.contains("dashboard"));
		$(By.xpath("//*[@id=\"content\"]//*[text()=\"Dashboard\"]")).shouldBeVisible();
		
	};
	
	
}








