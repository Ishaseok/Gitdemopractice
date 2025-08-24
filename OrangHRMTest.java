package orangehrmtest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangHRMTest {


    WebDriver driver;
    @Test(priority = 1)
    void Openapp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Browse drivers\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority = 2)
    void testlogo() throws InterruptedException {
        Thread.sleep(3000);
        Boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("The logo is ....." + status);

    }
    @Test(priority = 3)
    void testLogin(){
      driver.findElement(By.xpath("//input[@placeholder='Username']"))
                .sendKeys("ghjy");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("kimseok");
    }
    @Test(priority = 4)
    void testlogOut(){

    }
}
