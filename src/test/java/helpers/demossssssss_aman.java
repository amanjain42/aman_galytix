package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demossssssss_aman {

    public static void data(){

        WebDriverWait wait = new WebDriverWait(driver, 600);
        WebElement oo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Apply Now']")));
//        driver.findElement(By.xpath("//a[text()='Apply Now']")).click();
        oo.click();

        WebElement firstname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
        firstname.sendKeys("aman");

        WebElement lastname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
        lastname.sendKeys("jain");

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Please enter your email']")));
        email.sendKeys("aman@gmail.com");

        WebElement mobile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Please enter your mobile no.']")));
        mobile.sendKeys("8987678890");

        WebElement residence = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='State/Region']")));
        residence.sendKeys("rajasthan");

        WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='City']")));
        city.sendKeys("jaipur");

        WebElement ctc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Please enter your current CTC']")));
        ctc.sendKeys("1500000");

        WebElement expected_ctc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Please enter your expected CTC']")));
        expected_ctc.sendKeys("2000000");

        WebElement join = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Please enter days/months']")));
        join.sendKeys("15days");

        WebElement linkedin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Please enter your LinkedIn url']")));
        linkedin.sendKeys("http://ca.linkedin.com/in/aman");

        WebElement apply = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Apply Now']")));
        apply.click();

        WebElement close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='×'])[1]")));
        close.click();

        WebElement back = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Back to Jobs']")));
        back.click();
    }

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://www.galytix.com/careers/jobs");

        Thread.sleep(10000);



        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[1]/div/div[1]/h3")).click();
        data();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[1]/div/div[2]/h3")).click();
        data();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[1]/div/div[3]/h3")).click();
        data();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[1]/div/div[4]/h3")).click();
        data();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[2]/div/div[1]/h3")).click();
        data();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/h3")).click();
        data();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[2]/div/div[3]/h3")).click();
        data();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[2]/div/div[4]/h3")).click();
        data();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/h3")).click();
        data();
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[3]/div/div[2]/h3")).click();
        data();
        js.executeScript("window.scrollBy(0,1000)");


        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[4]/div/div[1]/h3")).click();
        data();
        js.executeScript("window.scrollBy(0,1000)");

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[4]/div/div[2]/h3")).click();
        data();
        js.executeScript("window.scrollBy(0,1000)");

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[4]/div/div[3]/h3")).click();
        data();
        js.executeScript("window.scrollBy(0,1000)");

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div[4]/div/div[4]/h3")).click();
        data();
        js.executeScript("window.scrollBy(0,1000)");

    }
}
