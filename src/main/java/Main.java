import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/Juff/Documents/JavaProjects/Programs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://modnakasta.ua");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        for (int i = 0; i <100 ; i++) {
            jse.executeScript("window.scrollBy(0,250)", "");
            Thread.sleep(1000);
        }


    }



}
