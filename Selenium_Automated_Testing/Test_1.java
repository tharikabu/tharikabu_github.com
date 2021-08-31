import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1{

	static WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	

	//1.test case for verification of title
	public void checkName() {
		WebElement BrandName= driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a"));
		
		if(BrandName.isDisplayed()) {
			System.out.println("BrandName is verified succesfully ");
		}
		else {
			System.out.println("name is not verified");
		}
		
	}
	
	
	//2.test case for verification of Logo
	public void checklogo() {
		WebElement logo= driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img"));
		if(logo.isDisplayed()) {
			System.out.println("Logo is verified succesfully");
		}
		else {
			System.out.println("logo is not verified");
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Test_1 obj=new Test_1();
		obj.launch();
		obj.checkName();
		obj.checklogo();
//		driver.close();
	}

}
