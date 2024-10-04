package com.Hrms.tests;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.Hrms.base.BasePage;
import com.Hrms.pages.LoginPage;
import com.Hrms.pages.PIMPage;
import com.Hrms.utils.CommonUtils;
import com.Hrms.utils.TestNGUtility;

public class TestPIMPage extends BasePage{
	@BeforeTest
	public void setup() throws Exception {
		
	CommonUtils.initialize();
	CommonUtils.launchBrowserAndNavigateToApp();
		
	}
	
	@AfterTest
	public void close() throws Exception {
		
	//driver.quit();
		
	}
		
	
	//----------------Page class objects Implementations---------
	
	LoginPage loginPage = new LoginPage();
	
	PIMPage pimPage = new PIMPage();
	
	@Test(description="Verify that an employee can be added successfully",priority=0)
	public void addEmployee() throws Exception {
	
	loginPage.login();
	CommonUtils.hardWait(5);
	TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
	CommonUtils.moveToElement(PIMPage.getPim());
	CommonUtils.clickElement(PIMPage.getAddEmp());
	CommonUtils.hardWait(5);
	CommonUtils.switchToFrame(PIMPage.getFrame());
	CommonUtils.enterValue(PIMPage.getFirstName(), "Sai",true);
	CommonUtils.enterValue(PIMPage.getLastName(), "P",true);
	CommonUtils.clickElement(PIMPage.getSave());
	CommonUtils.clickElement(PIMPage.getBackButton());
	TestNGUtility.assertTrue("Sai P",CommonUtils.getElementText(PIMPage.getEmpName()));
	
	}
	
	@Test(description="Verify that the search functionality returns the correct employee",priority=1,enabled=false)
	public void searchEmployee() throws Exception {
		loginPage.login();
		CommonUtils.hardWait(5);
		TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
		CommonUtils.moveToElement(PIMPage.getPim());
		CommonUtils.clickElement(PIMPage.getAddEmp());
		
		
		
		
		
	}
	
	@Test(description="Verify that employee details can be edited successfully",priority=2)
	public void editEmployeeDetails() throws Exception {
	
	
	}
	
	@Test(description="Verify that an employee can be deleted successfully",priority=3)
	public void deleteEmployee() throws Exception {
	
	
	}
	
	@Test(description="Verify that the employee list is displayed correctly with accurate information",priority=4)
	public void viewEmployeeList() throws Exception {
	
	
	}
	
	@Test(description="Verify that photos can be added to employee profiles",priority=5)
	public void addEmployeePhotos() throws Exception {
	
	
	}
	
	@Test(description="Verify that employee details are correctly displayed",priority=6)
	public void viewEmployeeDetails() throws Exception {
	
	
	}
	
	@Test(description="Verify that the employment status of an employee can be updated",priority=7)
	public void editEmploymentStatus() throws Exception {
	
	
	}
	
	@Test(description="Verify that the employee list can be filtered based on various criteria",priority=8)
	public void filterEmployeeList() throws Exception {
	
	
	}
}
