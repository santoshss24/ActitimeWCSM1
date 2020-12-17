package testcases;

import org.testng.annotations.Test;

import pages.homepage;

public class TC001 extends basetest
{
	
	@Test
	public void copyTask()
	{
		homepage homepage=new homepage(driver, webActionUtil);
		homepage.clickOnCallsTask();
		homepage.clickOnActionButton();
		homepage.clickOnCopyToLink();
		homepage.clickOnSelectCustomer();
		homepage.clickOnSelectProject();
		homepage.clickOnCopyTaskButton();
		homepage.clickOnPanelClose();
	}

}
