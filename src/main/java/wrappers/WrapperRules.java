package wrappers;

public interface WrapperRules {
	
	/**
	 * Launch the browser name
	 * Load the url
	 * Maximize the browser
	 * Set the implicitwait
	 */
	public void launchApp(String browserName, String url);
	
	/**
	 * Launch firefox
	 * Load the url
	 * Maximize the browser
	 * Set the implicitwait
	 */
	public void launchApp(String url);
	
	/**
	 * Enter the value using by id
	 * 
	 */
	public void enterById(String id, String dataToEnter);
	
	/**
	 * Click using class Name
	 * 
	 */
	public void clickByClassName(String className);
	
	/**
	 * Verifies the title
	 * 
	 */
	public void verifyTitle(String expectedTitle);
	
	/**
	 * Close all browsers
	 * 
	 */
	public void closeAllBrowsers();
	
	/**
	 * Take snap
	 */
	public void takeSnap();
	
	/**
	 * Switch to Primary window
	 */

	public void switchToPrimaryWindow(String parentWindowHandle);
	
	/**
	 * Switch to Last window
	 */
	
	public void switchToLastWindow();
	
	/**
	 * Switch to Frame by Web element
	 */
	
	public void switchToFrameByElement(String frameElement);
	
	/**
	 * Switch to First frame
	 */
	
	public void switchToFirstFrame();
	
	/**
	 * Accept Alert
	 */

	public void acceptAlert();
	
	/**
	 * Dismiss Alert
	 */

	
	public void dismissAlert();
	
	/**
	 * VerifyCurrentURL
	 */
	
	public void verifyCurrentUrl(String expectedURL);
	

	/**
	 * VerifyTextByID
	 */
	
	public void verifyTextById(String textID,String expectedText);
	

	/**
	 * VerifyTextByXpath
	 */
	
	public void verifyTextByXpath(String textXpath,String expectedText);
	

	/**
	 * ClickByLinkText
	 */
	
	public void clickByLinkText(String linkText);
	

	/**
	 * ClickByName
	 */
	
	public void clickByName(String name);
	

	/**
	 * ClickByXpath
	 */
	
	public void clickByXpath(String clickableXpath);
	

	/**
	 * Enter by Name
	 */
	
	public void enterByName(String name,String datatoEnter);
	

	/**
	 * Enter by XPATH
	 */
	
	public void enterByXpath(String xpath,String datatoEnter);
	
}
