// This script will use selenium to initiate a chrome browser, execute a click on a button
// and test for the existence of text on the page
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class clickmeTest {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

// Define command options to be used when the browser is instantiated
ChromeOptions options = new ChromeOptions();
options.addArguments("--headless");
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");

WebDriver driver = new ChromeDriver(options);

// Define URL to be referenced
driver.get("http://localhost");

// Click on the button
driver.findElement(By.id("clickme")).click();

// Verify that the page now has desired text on the page - fail the test if it isn't found
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

