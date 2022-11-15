package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowser
{
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        // System.setProperty("Key","Path");
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
        // Object creation
        WebDriver driver = new FirefoxDriver();

        // Launch the URL
        driver.get(baseUrl);

        // Maximise Window
        driver.manage().window().maximize();

        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);


        // get current URL
        System.out.println("Current URl :" + driver.getCurrentUrl());

        // Get page source
        System.out.println("Page source : " + driver.getPageSource());

        // Navigate to login page
        //driver.navigate().to(loginUrl);


        // find the email field element
        // driver.findElement(By.id());
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("palak05@gmail.com");

        // Find the password field element
        //  driver.findElement(By.name(""));
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("Palak123");

        // Close the browser automatically
         driver.close();



    }
}

