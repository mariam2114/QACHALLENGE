package UTPTest.Test;

import UTPTest.Page.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TestRegisterSatisfact {
    WebDriver driver;
    Register RegisterF;

    @BeforeTest
    public void startTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/Practiawork/Desktop/ChallengeQA/front/public/index.html");
    }



    @Test
    public void RegisterdeUsuarios() {
        RegisterF = new Register(driver);
        RegisterF.PonerDatos(
                "user@hotmail.com",
                "PAS123"
                );
    }


    @AfterTest
    public void cerrarventanaF() {
        driver.quit();
    }
}
