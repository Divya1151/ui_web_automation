import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest {

    public WebDriver driver;


    @BeforeClass
    public void SetUp(){
        driver = new ChromeDriver();
        driver.get("https://phptravels.org/clientarea.php");
    }

    @Test
    public void TestLogin(){
        LoginPage loginobj = new LoginPage(driver);
        loginobj.LoginToDemoSite("er.divya.singla@gmail.com", "Divya123");
    }

    @AfterTest
    public void TearDown(){
        driver.quit();
    }
}

