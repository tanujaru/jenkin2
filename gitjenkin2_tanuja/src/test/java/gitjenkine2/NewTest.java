package gitjenkine2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	  public void f1() {
		  System.out.println("hello Git jenlkin 1");
	  }
	  @Test
	  public void f2() {
		  System.out.println("hello Git jenlkin 2");
		  System.out.println("hello Git jenlkin 3");
	  }
	  @Test
	  public void f3() throws InterruptedException {
		  System.out.println("hello Git jenlkin 2");
		  System.setProperty("webdriver.chrome.driver", "C:\\Tanuja\\installer\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.ndtv.com/");
			Thread.sleep(2000);
		  
	  }
}
