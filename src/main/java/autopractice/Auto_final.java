package autopractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Auto_final {
	
	WebDriver Driver;
	By Add_categorie_FIELD =By.xpath("//*[@id=\"extra\"]/input[1]");
	By add_field =By.xpath("//*[@id=\"extra\"]/input[2]");
	By month_DROPDOWN_FIELD=By.xpath("//*[@id=\"extra\"]/select[3]");
	@BeforeMethod
	public void init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver2\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.get("https://techfios.com/test/101/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
@Test
	public void addcategorie(){
	Driver.findElement(Add_categorie_FIELD).sendKeys("Ishuri");
	Driver.findElement(add_field).click();
	
Assert.assertEquals("The category you want to add already exists",Driver.findElement(Add_categorie_FIELD).isDisplayed());

	Select sel = new Select(Driver.findElement(month_DROPDOWN_FIELD));
	sel.selectByVisibleText("Jan");
	
}
}
