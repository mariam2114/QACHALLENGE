package UTPTest.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    public Login(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="email")
    private WebElement nombreusuario;
    @FindBy(id="password")
    private WebElement contra;
    @FindBy(id="login")
    private WebElement Botonlogin ;


    public void TextUsuario(String str){
        nombreusuario.sendKeys(str);
    }
    public void Textpassword(String str){
        contra.sendKeys(str);
    }
    public void clickinboton(){
        Botonlogin.click();
    }

    }


