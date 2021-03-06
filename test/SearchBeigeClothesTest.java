// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SearchBeigeClothesTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void searchBeigeClothes() {
    // Test name: searchBeigeClothes
    // Step # | name | target | value | comment
    // 1 | open | /index.php |  | 
    driver.get("http://automationpractice.com/index.php");
    // 2 | click | css=.sf-menu > li > a |  | 
    driver.findElement(By.cssSelector(".sf-menu > li > a")).click();
    // 3 | click | linkText=Beige (1) |  | 
    driver.findElement(By.linkText("Beige (1)")).click();
    // 4 | assertText | css=.top-pagination-content > .product-count | Showing 1 - 1 of 1 item | 
    assertThat(driver.findElement(By.cssSelector(".top-pagination-content > .product-count")).getText(), is("Showing 1 - 1 of 1 item"));
    // 5 | click | css=.ajax_block_product:nth-child(4) .icon-eye-open |  | 
    driver.findElement(By.cssSelector(".ajax_block_product:nth-child(4) .icon-eye-open")).click();
    // 6 | selectFrame | index=0 |  | 
    driver.switchTo().frame(0);
    // 7 | assertText | css=.editable:nth-child(2) | demo_4 | 
    assertThat(driver.findElement(By.cssSelector(".editable:nth-child(2)")).getText(), is("demo_4"));
  }
}
