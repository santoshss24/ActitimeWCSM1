package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends basepage 
{
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath = "(//div[text()='Calls'])[1]")
	private WebElement CallsTask;
	
	@FindBy(xpath = "//div[text()='ACTIONS']")
	private WebElement ActionsButton;
	
	@FindBy(xpath = "//div[@class=\"copyButton\"]")
	private WebElement CopyTaskToLink;
	
	@FindBy(xpath = "(//div[@class=\"selectedItem\"])[3]")
	private WebElement SelectCustomerDropdown;
	
	@FindBy(xpath = "//div[text()='Big Bang Company']")
	private WebElement selectCustomerOption;
	
	@FindBy(xpath = "//div[text()='- Select Project -']")
	private WebElement selectProjectDropdown;
	
	@FindBy(xpath = "//div[text()='Flight operations']")
	private WebElement selectProjectOption;
	
	@FindBy(xpath = "//div[text()='Copy']")
	private WebElement copyTaskButton;
	
	@FindBy(xpath = "//div[@class=\"hideButton_panelContainer\"]")
	private WebElement closePanelContainer;
	
	public homepage(WebDriver driver, libraries.webActionUtil webActionUtil) {
		super(driver, webActionUtil);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnCallsTask()
	{
		webActionUtil.clickOnElement(CallsTask);
	}
	
	public void clickOnActionButton()
	{
		webActionUtil.clickOnElement(ActionsButton);
	}
	
	public void clickOnCopyToLink()
	{
		webActionUtil.clickOnElement(CopyTaskToLink);
	}
	
	public void clickOnSelectCustomer()
	{
		webActionUtil.clickOnElement(SelectCustomerDropdown);
		webActionUtil.clickOnElement(selectCustomerOption);
	}
	
	public void clickOnSelectProject() {
		
		webActionUtil.clickOnElement(selectProjectDropdown);
		webActionUtil.clickOnElement(selectProjectOption);
	}
	
	public void clickOnCopyTaskButton()
	{
		webActionUtil.clickOnElement(copyTaskButton);
	}
	
	
	public void clickOnPanelClose()
	{
		webActionUtil.clickOnElement(closePanelContainer);
	}
	public void clickOnLogout()
	{
		webActionUtil.clickOnElement(logoutLink);
	}
	

}
