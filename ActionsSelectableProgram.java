package week4.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSelectableProgram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		WebElement item2 = driver.findElement(By.xpath("//li[text() ='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text() ='Item 3']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text() ='Item 5']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text() ='Item 7']"));

		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item2).click(item3).click(item5).keyUp(Keys.CONTROL).perform();
		//driver.close();
	}

}
