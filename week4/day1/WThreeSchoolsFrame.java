package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class WThreeSchoolsFrame {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized","Incognito");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		WebElement text = driver.findElement(By.xpath("//button[text()='Try it']"));
		text.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement text2 = driver.findElement(By.xpath("//button[text()='Try it']//following::p"));
		String text3 = text2.getText();
		System.out.println("RETRIVED TEXT FROM THE WEB PAGE: "+text3);
		driver.switchTo().defaultContent();
		driver.quit();
	}
}
