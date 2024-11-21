package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTestOnWindowUsingChrome {
    WebDriver driver;

    @Test(priority = 1) 
    public void setup() throws MalformedURLException {
        // URL của Node Server
        String nodeURL = "http://192.168.95.1:5555/wd/hub/";
        
        // Cấu hình ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Ví dụ: Mở trình duyệt ở chế độ toàn màn hình
        
        // Tạo DesiredCapabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        cap.setPlatform(Platform.WINDOWS);
        
        // Khởi tạo RemoteWebDriver với DesiredCapabilities
        driver = new RemoteWebDriver(new URL(nodeURL), cap);
    }

    @Test(priority = 2) 
    public void login() {
        driver.get("http://w.w.w.yatra.com/");
        driver.findElement(By.id("username")).sendKeys("pavanoltraining");
        driver.findElement(By.id("password")).sendKeys("Test@selenium123");
        driver.findElement(By.name("login")).click();

        String capText = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText();

        if (capText.contains("pavanoltraining")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
