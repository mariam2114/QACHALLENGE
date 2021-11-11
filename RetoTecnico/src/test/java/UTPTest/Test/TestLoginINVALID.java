package UTPTest.Test;

import UTPTest.Page.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestLoginINVALID {
    WebDriver driver;
    Login sesion2;
    @BeforeTest
    public void startTestLogin2() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/Practiawork/Desktop/ChallengeQA/front/public/index.html");
    }

    @Test
    public void InicarSesion2() throws InterruptedException {
        sesion2 = new Login(driver);

        // USUARIO NO REGISTRADO

        sesion2.TextUsuario("USERTESThotmail.com");
        sesion2.Textpassword("456");
        sesion2.clickinboton();
        Thread.sleep(1000);


    }


    @AfterTest
    public void cerrarnavegador2() {
        driver.quit();
    }

}

