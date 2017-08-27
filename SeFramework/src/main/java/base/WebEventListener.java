package base;



import javax.management.RuntimeErrorException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import reporter.XtentReports;

public class WebEventListener extends XtentReports implements WebDriverEventListener{

	private NoSuchElementException throwable;

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("The Alert "+arg0+" are accepted ");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("The Alert "+arg0+" are dismissed ");
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
	//	System.out.println("The entered/selected webelement "+arg0+"and the locator " +arg1+ "with given value is changed/selected succefully" +arg2 );
		reportStep("After entering value", "PASS");
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
	//	System.out.println("The element " + arg1+ "with locator" +arg0+ "clicked" );
		reportStep("After clicking on element", "PASS");
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("The element " + arg0+ "with locator" +arg1+ "found" );
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("The browser "+driver+" launched with url " +url);
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		
		WebDriverWait wait =  new WebDriverWait(arg1,30);
		wait.until(ExpectedConditions.elementToBeClickable(arg0));
		System.out.println("sample test");
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver arg1) {
		
		reportStep("Inside Exception", "FAIl");
		if(throwable instanceof NoSuchElementException) {
			System.out.println("The element counld not be found "+throwable.getMessage());
		}
		else if (throwable instanceof NoSuchWindowException) {
			System.out.println("The window count bot be found" +throwable.getMessage());
		}
		else if (throwable instanceof InvalidSelectorException) {
			System.out.println("The window count bot be found" +throwable.getMessage());
		}
		
		else if (throwable instanceof NotFoundException) {
			System.out.println("The window count bot be found" +throwable.getMessage());
		}	
			else if (throwable instanceof NoAlertPresentException) {
				System.out.println("The window count bot be found" +throwable.getMessage());
			}
		
			else if (throwable instanceof NoSuchFrameException) {
				System.out.println("The window count bot be found" +throwable.getMessage());
			}
			else if (throwable instanceof ElementNotVisibleException) {
				System.out.println("The window count bot be found" +throwable.getMessage());
			}
			else if (throwable instanceof WebDriverException) {
				System.out.println("The window count bot be found" +throwable.getMessage());
			}
		
			else if (throwable instanceof WebDriverException) {
				System.out.println("The window count bot be found" +throwable.getMessage());
			}
		
		throw new RuntimeException();
		
	}

	@Override
	public EventFiringWebDriver getEventDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		return 0;
	}

	
		
}

