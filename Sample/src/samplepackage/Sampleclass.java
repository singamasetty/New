package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;


public class Sampleclass 
{

	public static void main(String[] args) throws Throwable
	{
		
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\10559\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\10559\\Desktop\\New folder\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();

		driver.get("http://pgftechspace.com/axispro_v1.0.6/central/");
		Thread.sleep(5000);

		Screen s=new  Screen();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Login
		driver.findElement(By.name("username")).sendKeys("super@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345",Keys.ENTER);
		Thread.sleep(5000);
		
			//brand creation
			Actions bc=new Actions(driver);
			WebElement br=driver.findElement(By.xpath("//*[@id='left-navigation']/ul/li[3]/a/i"));
		    bc.moveToElement(br).build().perform();
		    driver.findElement(By.xpath("//span[contains(text(),'Brand List')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='btn btn-danger pull-right newbuttonstyle']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div[1]/div/div/div/form/div/div[2]")).click();
			//s.click("branddd.png");
			Thread.sleep(2000);
			// Dropdown
			Select dd= new Select(driver.findElement(By.xpath("//select[@id='AddOrganizationSelect']")));
			Thread.sleep(2000);
			dd.selectByVisibleText("Raviii");
			driver.findElement(By.name("search")).click();
		driver.findElement(By.name("brand_name")).sendKeys("diesel5");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("emails1@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("7013421503");
		driver.findElement(By.name("address")).sendKeys("chennai");
		WebElement e=driver.findElement(By.id("place"));
		Actions ab= new Actions(driver);

		ab.sendKeys(e, "chennai").build().perform();
		s.click("city.png");
		Thread.sleep(1000);
		Select d1=new Select(driver.findElement(By.id("no_of_sites")));
		d1.selectByValue("1");
		driver.findElement(By.name("option[0]")).sendKeys("raviteja");
		Select d2=new Select(driver.findElement(By.name("property_type[0]")));
		d2.selectByVisibleText("Corporate Spaces");
		driver.findElement(By.name("submit")).click();
		
		/*if(s.exists("brandexits.png") != null )
		{
			et.log(LogStatus.PASS,"Brand created successfullly");
	       
	    }
		else
			
		{
			
			et.log(LogStatus.FAIL,"brand  creation failed ");
		}
			
		}*/
		driver.close();

	}
	

		
		
	}


