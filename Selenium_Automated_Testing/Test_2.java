import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test_2 {

	static WebDriver driver;
	public void checkjoinus() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//3.test case for checking join us, why join us 
		
		WebElement joinus =  driver.findElement(By.xpath("//a[contains(text(),'Join Us')]"));
		joinus.click();
		Thread.sleep(3000);
		WebElement whyjoinus = driver.findElement(By.xpath("//a[contains(text(),'Why Join Us')]"));
		whyjoinus.click();
		Thread.sleep(3000);
		
		//4.test case for contact details
		
		WebElement joinForm = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/h3"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", joinForm);
		Thread.sleep(3000);
		if(joinForm.isDisplayed()) {
			System.out.println("Join form Diplayed");
		}
	}
	
	
	//5.test case for submitting the my details
	public void contact() throws InterruptedException {
		WebElement Name =  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/input[1]"));
		Name.sendKeys("Abu Tharik Rasool");
		Thread.sleep(3000);
		
		WebElement Email = driver.findElement(By.xpath("//input[@name=\"Email\"]"));
		Email.sendKeys("tharikabu007@gmail.com");
		Thread.sleep(3000);
		
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/select"));
		Select selectRole = new Select(dropdown);
		selectRole.selectByVisibleText("Intern");
		Thread.sleep(3000);  
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@value=\"Submit\"]"));
		submitButton.click();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Test_2 obj = new Test_2();
		obj.checkjoinus();
		obj.contact();
//		driver.close();
	}

}
