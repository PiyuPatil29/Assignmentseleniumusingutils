//3.Use below link:
//https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_table_test
//Identify td element showing Savings of month February,retrieve the savings value and print on console

package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdemo2 {

	public static WebDriver driver;

	@Test
	public void m1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");

		int rows = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println("rows are:" + rows);

		int column = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th")).size();
		System.out.println("Columns are: " + column);

		WebElement table = driver.findElement(By.xpath("/html/body/table"));

		WebElement rowelement = table.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[3]"));
		String row = rowelement.getText();
		System.out.println("Country name is " + row);
		Thread.sleep(3000);

		WebElement columnvalue = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[1]"));
		String col = columnvalue.getText();
		System.out.println(" Company name is " + col);

	}

}
