package auto;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonTest 
{
	
	public static void main(String []args) throws Exception
	{
		ChromeOptions options = new ChromeOptions();
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D678711876615%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D17635783219769814339%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9302709%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2371562&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		String currentWindow =driver.getWindowHandle();
	
		driver.findElement(By.id("ap_email")).sendKeys("+919373884772");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Pawan@007");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobile");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[@class ='a-size-medium a-color-base a-text-normal']")).click();
		 
		 
		Set <String> s = driver.getWindowHandles();
		
		ArrayList ar = new ArrayList(s);
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		driver.switchTo().window((String)ar.get(1));
		
		driver.close();
		
		driver.switchTo().window((String)ar.get(0));
		
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mens lofer bata formal shooes");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
	
		driver.switchTo().window((String)ar.get(0));
		
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("SunGlasse");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.switchTo().window((String)ar.get(0));
		
		driver.close();
		
	}

}
