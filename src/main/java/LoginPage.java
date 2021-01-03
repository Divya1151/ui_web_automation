import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = By.id("inputEmail");
    By password = By.id("inputPassword");
    By login = By.id("login");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void SetUsername(String input_username){
        driver.findElement(username).sendKeys(input_username);
    }

    public void SetPassword(String input_password){
        driver.findElement(password).sendKeys(input_password);
    }

    public void ClickLogin(){
        driver.findElement(login).click();
    }
    public void LoginToDemoSite(String username, String password){
        this.SetUsername(username);
        this.SetPassword(password);
        this.ClickLogin();
    }

}
