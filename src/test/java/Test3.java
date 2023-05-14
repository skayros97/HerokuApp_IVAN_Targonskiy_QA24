import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.List;
public class Test3 {
    @Test
    public static void testDropDown()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement DropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(DropDown);
        List<WebElement> DropPoints = select.getOptions();
        Assert.assertEquals(DropPoints.size(), 3);
        Assert.assertEquals(DropPoints.get(0).getText(), "Please select an option");
        Assert.assertEquals(DropPoints.get(1).getText(), "Option 1");
        Assert.assertEquals(DropPoints.get(2).getText(), "Option 2");
        select.selectByIndex(1);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 1");
        select.selectByIndex(2);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 2");
        driver.quit();
    }
}