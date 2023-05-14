import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.List;
public class Test1 {
    @Test
    public void testAddRemoveElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addButton.click();
        addButton.click();
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//button[text()='Delete']"));
        Assert.assertEquals(2, deleteButtons.size());
        deleteButtons.get(0).click();
        deleteButtons = driver.findElements(By.xpath("//button[text()='Delete']"));
        Assert.assertEquals(1, deleteButtons.size());
        driver.quit();
    }
}


