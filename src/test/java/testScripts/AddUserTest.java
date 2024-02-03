package testScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.BaseClass;

public class AddUserTest extends BaseClass {
	//this method is used to add a new user

	@Test
	public void addUserText() {
		SoftAssert soft = new SoftAssert();

		home.clickUsersTab();
		soft.assertTrue(users.getPageHeader().contains("Users"));
		users.clickNewButton();
		soft.assertEquals(addUser.getPageheader(), "Add New User");

		Map<String, String> map = excel.readFromExcel("Add User");

		addUser.setEmail(map.get("Email"));
		addUser.setPassword(map.get("Password"));
		addUser.setFirstName(map.get("Firstname"));
		addUser.setLastName(map.get("Lastname"));
		addUser.setAddress(map.get("Address"));
		addUser.setContactInfo(map.get("Contact Info"));
		addUser.uploadPhoto(map.get("Photo"));

		addUser.clickSave();

		soft.assertEquals(users.getSuccessMessage(), "Success!");
		soft.assertAll();

	}

}
