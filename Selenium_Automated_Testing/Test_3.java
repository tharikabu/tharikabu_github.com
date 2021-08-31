import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {
	static WebDriver driver;
	public void aboutus() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		
		//6.test case for checking About us, guiding principles and display them 
		WebElement AboutUs =  driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/a"));
		AboutUs.click();
		Thread.sleep(3000);
		
		WebElement GuidingPrinciples = driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[2]/a"));
		GuidingPrinciples.click();
		Thread.sleep(3000);
		
		
		WebElement guideText = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/h3/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", guideText);
		Thread.sleep(3000);
		
		if(guideText.isDisplayed()) {
			System.out.println("Guding Principles displayed");
		}
	}
	//7.test case for checking Advisor and Patrons Information
	public void advisor() throws InterruptedException {
		WebElement AdvisorPatron = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[3]"));
		AdvisorPatron.click();
		Thread.sleep(3000);
		
		WebElement Advisor= driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/h3/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", Advisor);
		
		
		if(Advisor.isDisplayed()) {
			System.out.println("Advsior information is displayed");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Test_3 obj = new Test_3();
		obj.aboutus();
		obj.advisor();
//		driver.close();

	}

}
