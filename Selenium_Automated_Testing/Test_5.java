import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_5 {
	static WebDriver driver;
	public void getlinks() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//10.test case for checking links and software & App
		WebElement Links =  driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/a"));
		Links.click();
		Thread.sleep(2000);
		
		WebElement SoftwareApp =  driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/ul/li[1]/a"));
		SoftwareApp.click();
		
		//11.test case for printing the links in software & app page
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(WebElement allLinks : links) {
			System.out.println(allLinks.getText() + "  -  " + allLinks.getAttribute("href"));
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Test_5 obj = new Test_5();
		obj.getlinks();	
//		driver.close();

	}

}
