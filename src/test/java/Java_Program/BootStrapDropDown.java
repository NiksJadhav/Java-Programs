package Java_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://example.com");
		
		// Locate the dropdown toggle button and click to reveal the options
       		 WebElement dropdownToggle = driver.findElement(By.className("dropdown-toggle"));
       		 dropdownToggle.click();

	        // Wait for the dropdown options to be visible (Optional, but recommended)
	        Thread.sleep(2000); // Example of implicit wait; better to use WebDriverWait for dynamic waits

	        // Locate and click the desired option
	        WebElement desiredOption = driver.findElement(By.xpath("//a[contains(text(),'Option Text')]"));
	        desiredOption.click();
	        
	        //OR
	        //  WebDriverWait wait = new WebDriverWait(driver, 10);
	        // WebElement desiredOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Option Text')]")));
	        // desiredOption.click();
	
	        // Close the browser
	        driver.quit(); 

	}

}
