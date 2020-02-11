import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class clickmeTest {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

ChromeOptions options = new ChromeOptions();
options.addArguments("headless");

WebDriver driver = new ChromeDriver();

//String baseUrl = "http://192.168.0.3";

driver.get("http://192.168.0.3");
//System.out.println(driver.getPageSource());
driver.findElement(By.id("clickme")).click();

System.out.println(driver.getPageSource());
if (driver.getPageSource().contains("Clicked")){;

System.out.println("Pass");
}
else
{
System.out.println("Fail");
System.exit(1);
}
driver.close();

}

}

