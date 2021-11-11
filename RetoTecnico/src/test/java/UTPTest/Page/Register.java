package UTPTest.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    WebDriver driver;
    @FindBy(id="email")
    private WebElement UserName;
    @FindBy(id="password")
    private WebElement Password;
    @FindBy(id="register")
    private WebElement BotonRegistrar ;


    public Register(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }


    public void PonerDatos(String USER,String PASSW) {

        UserName.sendKeys(USER);
        Password.sendKeys(PASSW);
        BotonRegistrar.click();
    }


}
