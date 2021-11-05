package week4.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSortProgram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		WebElement Item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement Item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		Point location = Item5.getLocation();
		int x = location.getX();
		int y = location.getY();
		Actions builder = new Actions(driver);
		builder.clickAndHold(Item2).moveByOffset(x, y).release().perform();
	//	driver.close();
	}

}
