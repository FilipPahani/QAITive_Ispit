package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.EmailableReporter;

import javax.xml.xpath.XPath;

public class RegistrationPage extends ComonPage{


    public RegistrationPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="#check1")
    WebElement pravnoLice;

    @FindBy(css="input[name=\"customer[first_name]\"]")
    WebElement Ime;

    @FindBy(css="input[name=\"customer[last_name]\"]")
    WebElement Prezime;

    @FindBy(css="input[name=\"customer[email]\"]")
    WebElement Email;

    @FindBy(css="input[name=\"customer[confirm_email]\"]")
    WebElement PotvrdaEmail;

    @FindBy(css="input[name=\"customer[password]\"]")
    WebElement Password;

    @FindBy(css="input[name=\"customer[confirm_password]\"]")
    WebElement ConfirmPassword;

    @FindBy(css="input[name=\"customer[mobile]\"]")
    WebElement Telefon;

    @FindBy(css="input[name=\"customer[company_name]\"]")
    WebElement Firma;

    @FindBy(css="input[name=\"customer[pib]\"]")
    WebElement Pib;




    //@FindBy(css="input[name=\"customer[date_of_birth]\"]")
    //WebElement Kalendar;

    @FindBy(css="input[name=\"customer[street]\"]")
    WebElement Ulica;

    @FindBy(css="input[name=\"customer[street_number]\"]")
    WebElement Broj;

    @FindBy(css="input[name=\"customer[floor]\"]")
    WebElement Sprat;

    @FindBy(css="input[name=\"customer[flat]\"]")
    WebElement BrojStana;

    @FindBy(css="input[name=\"customer[city]\"]")
    WebElement Grad;

    @FindBy(css="input[name=\"customer[post_code]\"]")
    WebElement PostanskiBroj;

    @FindBy(css="input[name=\"customer[phone]\"]")
    WebElement Brojtelefona;

    @FindBy(css="input[name=\"customer[accept_terms]\"]")
    WebElement AcceptTermsAndConditions;

    @FindBy(xpath="//iframe[starts-with(@name, 'a-')and starts-with(@src, 'https://www.google.com/recaptcha')]")
    WebElement RecaptchaFrame;

    @FindBy(css=".recaptcha-checkbox-border")
    WebElement Recaptcha;

    @FindBy(css="a[class=\"cookie-agree fnc-accept-cookies\"]")
    WebElement Cookie;


    public void pravnoLiceClick(){
        pravnoLice.click();

    }

    public void ImeFill(String string){
        Ime.sendKeys(string);

    }

    public void PrezimeFill(String string){
        Prezime.sendKeys(string);

    }

    public void EmailFill(String string){
        Email.sendKeys(string);

    }

    public void PotvrdaEmailFill(String string){
        PotvrdaEmail.sendKeys(string);

    }

    public void PasswordFill(String string){
        Password.sendKeys(string);

    }

    public void ConfirmPasswordFill(String string){
        ConfirmPassword.sendKeys(string);

    }

    public void TelefonFill(String string){
        Telefon.sendKeys(string);

    }

    public void FirmaFill(String string){
        Firma.sendKeys(string);
    }

    public void PibFill(String string){
        Pib.sendKeys(string);
    }




    public void UlicaFill(String string){
        Ulica.sendKeys(string);

    }

    public void BrojFill(String string){
        Broj.sendKeys(string);

    }

    public void SpratFill(String string){
        Sprat.sendKeys(string);

    }

    public void BrojStanaFill(String string){
        BrojStana.sendKeys(string);

    }


    public void PostanskiBrojFill(String string){
        PostanskiBroj.sendKeys(string);

    }

    public void BrojTelefonaFill(String string){
        Brojtelefona.sendKeys(string);

    }

    public void AcceptTermsAndConditionsClick(){
        AcceptTermsAndConditions.click();
    }

    public void RecaptchaClick(){
        WebDriverWait Wait=new WebDriverWait(driver,30);
        Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(RecaptchaFrame));
        Recaptcha.click();
    }

    public void CookieClick(){
        Cookie.click();
    }



}
