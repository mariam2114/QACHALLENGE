package UTPTest.Test;

import UTPTest.Page.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestRegisterINVALID {
    WebDriver driver;
    Register Register2;

    @BeforeTest
    public void startTest2() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/Practiawork/Desktop/ChallengeQA/front/public/index.html");
    }



    @Test
    public void RegisterdeUsuarios2() {
        Register2 = new Register(driver);

        // REGISTRO DE USUARIO SIN @

        Register2.PonerDatos(
                "userhotmail.com",
                "123"
        );
    }


    @AfterTest
    public void cerrarventana2() {
        driver.quit();
    }
}


