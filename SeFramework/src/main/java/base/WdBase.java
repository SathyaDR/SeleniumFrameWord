package base;

import org.openqa.selenium.WebElement;

public interface WdBase {
	
	/**
	 * This method will enter the value to the browser using webelement with url
	 * 
	 * browserType - id of the webelement
	 * url - The data to be sent to the webelement
	 * author - Sathya
	 */
	
	public void invokeApp(String browserType, String url); 
	
	/**
	 * This method will locate webelement
	 * WebElement - The locator of the Element in id, name, classname, xpath,link text,partial link text, tag name, css
	 * text  -The data to be sent to the webelement
	 * author sathya
	 */
	public WebElement locateElement(WebElement ele);
	
	/**
	 * This method will locate webelement with identified locator value
	 * WebElement to find the webelement type
	 * value- locator value
	 * author sathya
	 */
	public WebElement locateElement(String how, String using); 
	/**
	* This method will locate webelement with identified locator value
	 * WebElement - how - to find the webelement type
	 * value - using  - locator value
	 * author sathya
	 */
	public void type(WebElement ele, String value); 
	/**
	 * This method will click the element using identified locator
	 * locator of the element to be clicked
	 * author sathya
	 */
	public void clickElement();
	/**
	 * This method will select the element using identified locator with text
	 * 
	 * 
	 * author sathya
	 */
	public void selectByVisibleText(WebElement ele, String txt);
	
	public void selectByIndex(WebElement ele, int Index);
	
	public void selectByValue(WebElement ele, String value);
	
	public void switchToWindow(int index);
		
	public void alertAccept();
	
	public void alertDismiss();
	
	public String alertText(String txt);
	
	public String getAlertText(String txt);
	
	public void verifyTitle(WebElement ele, String Title);
	
	public void switchFrame();
	
	public String verifyText(String txt);
		
	public String getText(String txt);
		
	public void clickElement(WebElement ele);
		
	}
	


