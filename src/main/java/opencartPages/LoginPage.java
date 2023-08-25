package opencartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
		private WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
		
		private By userName = By.id("input-email");
		private By passWord = By.id("input-password");
		private By loginBtn = By.xpath("//input[@type='submit']");
		private By forgotPwdLinkLocator = By.linkText("Forgotten Password");
		private By logoutLinkLocator = By.linkText("Logout");
		
		public void enterEmail(String email) {
			WebElement username = driver.findElement(userName);
			username.sendKeys(email);
		}
		
		public void enterPwd(String password) {
			WebElement passwordInput = driver.findElement(passWord);
			passwordInput.sendKeys(password);
		}
		
		public void clickLoginBtn() {
			WebElement loginButton = driver.findElement(loginBtn);
			loginButton.click();
		}
		
		public void forgotPwdLink() {
			WebElement fgtpswd = driver.findElement(forgotPwdLinkLocator);
			fgtpswd.click();
		}
		
		public boolean confirmforgotPwdLink() {
			return driver.findElement(forgotPwdLinkLocator).isDisplayed();
		}
		
		public void logoutButton() {
			WebElement logLink = driver.findElement(logoutLinkLocator);
			logLink.click();
		}
		
		public void login(String email, String password) {
			enterEmail(email);
			enterPwd(password);
			clickLoginBtn();
		}
		
		public String forgotpwdUrl() {
			String urlForgotten = driver.getCurrentUrl();
			return urlForgotten;
		}
		
		
}
