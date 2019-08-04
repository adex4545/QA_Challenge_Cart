package qualityAuto;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Test_Validate {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://automationpractice.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jollybrown030@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("validate12");
        driver.findElement(By.xpath("//p[@class='submit']//span[1] ")).click();




    }



}














