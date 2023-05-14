import org.openqa.selenium.By ;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.List;
public class Test5 {
    @Test
    public static void testDropDown()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");
        WebElement Page = driver.findElement( By.tagName("p"));
        String ethalon = "This example demonstrates a typo being introduced. It does it randomly on each page load.";
        Assert.assertEquals(Page.getText(),ethalon);
        driver.quit();
    }
}
