import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

    }

    @Test
    public void doLogin(){

        driver.get("http://gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("Levchenkomaryna77@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

        // adding new comment
        /* ksjhfhsdfsjdhf
        jfjdhfjhf
         */

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }


}
