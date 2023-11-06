import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class locators {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("http://gbair.net/bookmyhotelflight1.0/hotels");
            WebElement login = driver.findElement(By.xpath("//span[contains(text(),' Login')]"));
            login.click();
            WebElement Memberlogin = driver.findElement(By.xpath("//a[contains(text(),'Member Login')]"));
            Memberlogin.click();

            WebElement Memberusername = driver.findElement(By.id("member_username"));
            Memberusername.sendKeys("lgesh818@gmail.com");

            driver.findElement(By.name("member_password")).sendKeys("Logesh@1");
           // driver.findElement(By.className("c-ripple js-ripple")).click();

            Thread.sleep(3000);
            driver.findElement(By.linkText("Forgot Password?  ")).click();
           // WebElement Submit=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
          //  WebElement checklabel = driver.findElement(By.xpath("//p[contains(text(),'Don't have an account?  ')]"));
           // checklabel.isDisplayed();

            //driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
           WebElement submit= driver.findElement(RelativeLocator.with(By.xpath("//span[contains(text(),'Login')]")).above(By.xpath("//p[contains(text(),'Don't have an account?  ')]")));
           submit.click();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
