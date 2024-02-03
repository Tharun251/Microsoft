package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserPage {
	// Declaration
	@FindBy(xpath = " //b[text()='Add New User']")
	private WebElement pageHeader;

	@FindBy(xpath = " //input[@id='email' and @required]     ")
	private WebElement emailTF;

	@FindBy(xpath = " //input[@id='password' and @required]    ")
	private WebElement passwordTF;

	@FindBy(xpath = " //input[@id='firstname' and @required]    ")
	private WebElement firstnameTF;

	@FindBy(xpath = " //input[@id='lastname' and @required]    ")
	private WebElement lastnameTF;

	@FindBy(xpath = " //textarea[@id='address']    ")
	private WebElement addressTextArea;

	@FindBy(xpath = " //input[@id='contact']    ")
	private WebElement contactInfoTF;

	@FindBy(xpath = "(//input[@id='photo'])[2]    ")
	private WebElement photoUploadButton;

	@FindBy(xpath = "//button[text()=' Save'  and @name='add']    ")
	private WebElement saveButton;

	// utilization
	public AddNewUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Initialization
	public String getPageheader() {
		return pageHeader.getText();
	}

	public void setEmail(String email) {
		emailTF.sendKeys(email);
	}

	public void setPassword(String password) {
		passwordTF.sendKeys(password);
	}

	public void setFirstName(String firstname) {
		firstnameTF.sendKeys(firstname);
	}

	public void setLastName(String lastname) {
		lastnameTF.sendKeys(lastname);
	}

	public void setAddress(String address) {
		addressTextArea.sendKeys(address);
	}

	public void setContactInfo(String contact) {
		contactInfoTF.sendKeys(contact);
	}

	public void uploadPhoto(String photopath) {
		photoUploadButton.sendKeys(photopath);
	}

	public void clickSave() {
		saveButton.click();
	}
}
