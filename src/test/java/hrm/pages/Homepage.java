package hrm.pages;

import net.thucydides.core.annotations.*;

public class Homepage {
	
	OrangeHRM_pages home;
	
	@Step("Verify Title ")
	public void verifyTitle() {
		
		home.verifyTitle();
	};
	
	@Step("Setup The Credentials")
	public void enterCredentials(String user, String pass) {

		home.setUsernamePassword(user, pass);
	};
	
	@Step("Verify Dashboard - Login : true ")
	public void verifyDashboard() {

		home.verifyLogin();
		
	};

}









