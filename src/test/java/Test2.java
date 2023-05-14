import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.List;
public class Test2
{
    @Test
    public static void testCheckboxes()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> CheckBoxes = driver.findElements( By.cssSelector("[type=checkbox]"));
        Assert.assertFalse(CheckBoxes.get(0).isSelected());
        CheckBoxes.get(0).click();
        Assert.assertTrue(CheckBoxes.get(0).isSelected());
        Assert.assertTrue(CheckBoxes.get(1).isSelected());
        CheckBoxes.get(1).click();
        Assert.assertFalse(CheckBoxes.get(1).isSelected());
        driver.quit();
    }
}