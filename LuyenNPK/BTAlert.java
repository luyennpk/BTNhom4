import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BTAlert {

	public BTAlert() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\framgia\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		String baseURL = "https://www.webtoolnavi.com/demo/sweetalert2/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		WebElement tryMeBtn = driver.findElement(By.xpath("/html/body/section[2]/div[13]/button"));
		tryMeBtn.click();
		
		
		driver.switchTo().window(driver.getWindowHandle()).findElement(By.xpath("/html/body/div[2]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/button[1]")).click();
		
	}

}
