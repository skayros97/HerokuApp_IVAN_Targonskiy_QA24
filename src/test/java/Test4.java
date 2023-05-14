import org.openqa.selenium.By ;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.List;
public class Test4 {
    @Test
    public static void testDropDown()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.tagName("input"));
        input.clear();
        input.click();
        input.sendKeys("12345");
        Assert.assertEquals(input.getAttribute("value"),"12345");
        input.clear();
        input.sendKeys("qwerty");
        Assert.assertEquals(input.getAttribute("value"),"");
        input.clear();
        input.sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(input.getAttribute("value"),"1");
        input.sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(input.getAttribute("value"),"0");
        driver.quit();
    }
}