package CogPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CogHelper.CogloginHelper;

public class CogTestPage {
	
	WebDriver driver;
	CogloginHelper helperClass= new CogloginHelper();
	

public void user_lunch_site_url() {
	
	helperClass.driverSetup();
	
	driver = helperClass.driver;
}

public void user_enter_correct_username_and_password() {
	
	
	
	 WebElement username=driver.findElement(By.xpath("//input[@id='usernameField']"));
	    WebElement password=	driver.findElement(By.xpath("//input[@id='passwordField']"));
		
		username.sendKeys("prashantku77@gmail.com");
		password.sendKeys("Ashu@6991");
		
}

public void user_click_on_login_button() {
	
	 WebElement submitbtn=driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']"));
		submitbtn.click();
	
	
}

public void validate_successful_login() {
	
      if(driver.findElement(By.xpath("//div[@title='Prashant Kumar']")).isDisplayed()) {
		
		System.out.println("Prashant Kumar Successfully Loing into Noukari Profile");

}}

public void user_click_on_update_profile_button() {
	
    WebElement updatebtn= driver.findElement(By.xpath("//a[text()='View']"));
    updatebtn.click();

}

public void user_click_on_update_resume_button() {

    WebElement	updateresume=driver.findElement(By.xpath("//input[@value='Update resume']"));
    updateresume.click();


}

public void user_upload_select_resume_from_system() {
  WebElement uploadfile=driver.findElement(By.xpath("//input[@value='Update resume']"));
  uploadfile.sendKeys("C:\\Users\\prash\\OneDrive\\Documents\\Prashant_5Y_Exp_automation_java.pdf");

}

public void validate_successful_updation() {

driver.findElement(By.xpath("//div[@class='updateOn typ-14Regular']")).isDisplayed();
System.out.println("Your Resume is uploaded");

}

}
