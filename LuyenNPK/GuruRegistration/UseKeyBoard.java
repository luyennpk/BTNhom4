package GuruRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.AcceptedW3CCapabilityKeys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UseKeyBoard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\framgia\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
        String information[] = {"Luyen","Nguyen","0974599467","luyen0101+3@gmail.com","16 Ly Thuong Kiet","Danang", "Danang","55000","VIETNAM","LuyenNPK1","Luyen123","Luyen123"};
            
        driver.get(baseUrl);
        
        // Registering        
        driver.findElement(By.name("firstName")).sendKeys(information[0]);
        driver.findElement(By.name("lastName")).sendKeys(information[1]);
        driver.findElement(By.name("phone")).sendKeys(information[2]);
        driver.findElement(By.name("userName")).sendKeys(information[3]);
        driver.findElement(By.name("address1")).sendKeys(information[4]);
        driver.findElement(By.name("city")).sendKeys(information[5]);
        driver.findElement(By.name("state")).sendKeys(information[6]);
        driver.findElement(By.name("postalCode")).sendKeys(information[7]);
        Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByValue(information[8]);
		driver.findElement(By.name("email")).sendKeys(information[9]);
		driver.findElement(By.name("password")).sendKeys(information[10]);
		driver.findElement(By.name("confirmPassword")).sendKeys(information[11]);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(4000);		
		Boolean isExist = (driver.getPageSource().contains(information[0]))&&(driver.getPageSource().contains(information[1]))&&(driver.getPageSource().contains(information[9]));
		if (isExist)
				{
			
			
			WebElement signinlink = driver.findElement(By.linkText("sign-in"));
			action.moveToElement(signinlink).click().perform();
	    		     
		   //Login
			 Thread.sleep(4000);		 
			 driver.findElement(By.name("userName")).sendKeys(information[9]);
			 driver.findElement(By.name("password")).sendKeys(information[10]);
			 Thread.sleep(4000);
			 WebElement submitBtn = driver.findElement(By.name("submit"));
			 action.moveToElement(submitBtn).click().perform();
	    	 System.out.println("login success");			     

			}
		else
		{
			System.out.println("The registered information is not correct");
		}
		
		
		
	}

}
