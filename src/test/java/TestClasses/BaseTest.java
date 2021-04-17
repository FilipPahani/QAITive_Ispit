package TestClasses;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    DriverManager driverManager;
    String URL = "https://www.tehnomanija.rs/";

    public void init(String browser,int time, String URL){
        driverManager = DriverManagerFactory.getDriverManager(browser);
        driver = driverManager.getWebDriver();
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        driver.get(URL);
    }
    public void quitDriver(){
        driver.quit();
    }
    public void takeScreenshot(String fileName) throws IOException, InterruptedException {
        Thread.sleep(1000);
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file , new File("src/screenshots/"+fileName+".png"));
    }

    public String randomEmail(){
        Random random = new Random();
        int x = random.nextInt(1000);
        System.out.println("pahanifilip" + x + "@gmail.com");
        return "pahanifilip" + x + "@gmail.com";
    }

}
