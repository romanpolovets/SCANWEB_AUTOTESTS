import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://cloud-stage.iscanner.com/");

        WebElement element = driver.findElement(By.xpath("//input[@type='email']"));
        element.sendKeys("roman.polovets@bpmobile.com");

        WebElement buttonNext = driver.findElement(By.xpath("//button[@type='submit']"));
        buttonNext.click();

        WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
        inputPassword.sendKeys("11Test11");

        WebElement buttonNextPassword = driver.findElement(By.xpath("//button[@type='submit']"));
        buttonNextPassword.click();

        WebElement buttonAccount = driver.findElement(By.xpath("(//button[@class='sc-fvxzrP bFhGLt'])[2]"));
        buttonAccount.click();

        WebElement buttonSignOut = driver.findElement(By.xpath("(//button[@class='sc-jUosCB gaYRsE'])[2]"));
        buttonSignOut.click();
    }
}
