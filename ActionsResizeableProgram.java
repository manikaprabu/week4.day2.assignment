package week4.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsResizeableProgram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		WebElement resizeableEle = driver.findElement(By.xpath("(//div[@id='resizable']//div)[3]"));
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(resizeableEle).moveByOffset(305,55).release().perform();
		driver.close();
	}

}
