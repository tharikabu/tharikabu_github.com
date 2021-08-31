import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_4 {
	static WebDriver driver;
	public void contactus() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//8.test case for checking contact us
		WebElement contactUs =  driver.findElement(By.xpath("//a[contains(text(),\"Contact Us\")]"));
		contactUs.click();
		Thread.sleep(3000);
		
		WebElement contactPage =  driver.findElement(By.xpath("/html/body/div[2]/div/h3"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", contactPage);
		
		if(contactPage.isDisplayed())
		{
			System.out.println("Contact Page Displayed");
		}
		
		//9.test case for navigating to LinkedIn page of sparks foundation
		
		WebElement LinkedInButton =  driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]/div[1]/ul/li[2]/a"));
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView()", LinkedInButton);
		Thread.sleep(3000);
		LinkedInButton.click();
		
		
//		WebElement LinkedInPage = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/section[1]/div/div[2]/div[1]/h1"));
//		
//		if(LinkedInPage.isDisplayed())
//		{
//			System.out.println("LinkedIn Page Displayed");
//		}
}
	
	public static void main(String[] args) throws InterruptedException {
		Test_4 obj = new Test_4();
		obj.contactus();	
//		driver.close();
	}
}

