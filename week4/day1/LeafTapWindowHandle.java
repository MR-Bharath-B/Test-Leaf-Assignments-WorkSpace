package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafTapWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized","Incognito");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa",Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[(text()='Contacts')]")).click();
		driver.findElement(By.xpath("//a[(text()='Merge Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'okup2autocomplete')]")).click();
		Set<String> fromHandles = driver.getWindowHandles();	
		List<String> fromPage=new ArrayList<String>(fromHandles);
		driver.switchTo().window(fromPage.get(1));
		driver.findElement(By.xpath("(//tr)[4]//a")).click();
		driver.switchTo().window(fromPage.get(0));
		driver.findElement(By.xpath("(//a[contains(@href,'okup2autocomplete')])[2]")).click();
		Set<String> toHandles = driver.getWindowHandles();
		List<String> toPage=new ArrayList<String>(toHandles);
		driver.switchTo().window(toPage.get(1));
		driver.findElement(By.xpath("((//tr)[6])//a")).click();
		driver.switchTo().window(toPage.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println("TITLE OF THE WEB PAGE (After Merged Contact): "+title);
		driver.quit();
	}
}
