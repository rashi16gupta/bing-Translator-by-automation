package rashi.Bing;
import java.util.Iterator;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Bingtranslator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/rashi/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bing.com/translator");
		
	//	driver.findElement(By.className("t_navlink t_navlinkactive")).click();
	//	WebElement mySelectElement = driver.findElement(By.id("mySelect"));
	//	Select dropdown= new Select(mySelectElement);
		Select dropdown = new Select(driver.findElement(By.id("t_sl")));
	//  dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("English");
		driver.findElement(By.className("b_focusTextMedium")).click();
	    driver.findElement(By.id("t_sv")).sendKeys("A beautiful day");
	    
		Select dropdown1 = new Select(driver.findElement(By.id("t_tl")));
		dropdown1.selectByVisibleText("French");




		
	
	}

}
