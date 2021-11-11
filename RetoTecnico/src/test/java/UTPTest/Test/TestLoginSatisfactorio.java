package UTPTest.Test;

import UTPTest.Page.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestLoginSatisfactorio {
    WebDriver driver;
    Login sesion;
    @BeforeTest
    public void startTestLogin() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/Practiawork/Desktop/ChallengeQA/front/public/index.html");
    }

    @Test
    public void InicarSesion() throws InterruptedException {
        sesion = new Login(driver);
        sesion.TextUsuario("user@hotmail.com");
        sesion.Textpassword("PAS123");
        sesion.clickinboton();
        Thread.sleep(1000);


    }



    @AfterTest
    public void cerrarnavegador() {
        driver.quit();
    }



}
