package Harshith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chromedriver","C:\\Users\\student\\Music\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		WebElement createacc = driver.findElement(By.className("login-modal"));
		Thread.sleep(2000);
		createacc.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		WebElement phonenum = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		phonenum.click();
		phonenum.sendKeys("8019801084");
		
		WebElement continueBtn = driver.findElement(By.className("login-btn"));
		Thread.sleep(2000);
		continueBtn.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		
		WebElement otp = driver.findElement(By.name("otp"));
		Thread.sleep(1000);
		otp.sendKeys("7262");
		
		WebElement loginBtn = driver.findElement(By.className("login-btn"));
		loginBtn.click();
		
	}

}
