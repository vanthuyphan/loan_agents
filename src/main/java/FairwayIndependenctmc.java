import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FairwayIndependenctmc {
    private WebDriver driver;

    @BeforeClass
    public void init(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(testName = "Fairway Independent MC")
    public void getFairway() throws InterruptedException {
        driver.get("https://www.fairwayindependentmc.com/locations/california");

        Thread.sleep(1000);

    }

    @AfterClass
    public void cleanup(){
        if(driver !=null)
            driver.quit();
    }
}
