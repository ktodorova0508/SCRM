import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.util.concurrent.TimeUnit;

public class PlayYoutubeVideo {
    WebDriver driver;


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void playVideo() throws InterruptedException {

        //Assert the URL of youtube
        String URL = driver.getCurrentUrl();
        assertEquals(URL, "https://www.youtube.com/" );

        //Find the search box and enter the David Bisbal - Mucho más allá (De "Frozen 2")
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("David Bisbal - Mucho más allá (De \"Frozen 2\")");

        //Click the search button.
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

        //From the search results select the first video
        driver.findElement(By.xpath("//ytd-search[@class='style-scope ytd-page-manager']//img[@id='img']")).click();

        //Assert the URL of the video
        String URLVideo = driver.getCurrentUrl();
        assertEquals(URLVideo, "https://www.youtube.com/watch?v=XxSbXcfN_X4" );
    }


    public void tearDown() throws InterruptedException {
        driver.quit();
    }
}