package TestClasses;

import PomClasses.ComonPage;
import PomClasses.RegistrationPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class Registration extends BaseTest {

    ComonPage comonPage;

    RegistrationPage registrationPage;


    @BeforeMethod
    @Parameters({"browser"})
    public void setup(String browser){
        init(browser,30,URL);
    }

    @AfterMethod
    public void tearDown(){
        //quitDriver();
    }

    @Test
    public void registration() throws IOException, InterruptedException {
        String password="12345";
        String email=randomEmail();
        comonPage = new ComonPage(driver);
        registrationPage = new RegistrationPage(driver);
        comonPage.hoverPrijava();

        registrationPage.CookieClick();
        registrationPage.pravnoLiceClick();
        registrationPage.ImeFill("Filip");
        registrationPage.PrezimeFill("Pahani");
        registrationPage.EmailFill(email);
        registrationPage.PotvrdaEmailFill(email);
        registrationPage.PasswordFill(password);
        registrationPage.ConfirmPasswordFill(password);
        registrationPage.TelefonFill("1232456");
        registrationPage.FirmaFill("TestTeam");
        registrationPage.PibFill("1000200300");
        registrationPage.AcceptTermsAndConditionsClick();
        registrationPage.RecaptchaClick();
        takeScreenshot("test");
    }

}
