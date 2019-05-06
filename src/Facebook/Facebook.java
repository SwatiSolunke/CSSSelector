package Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 // To load the url
	     driver.get("https://www.facebook.com");
	     
	     // To maximize the window
	     driver.manage().window().maximize();
	     
	     // To print the current title of webpage
	     String title = driver.getTitle();
	     System.out.println("The current title of the webpage is:==>"+title);
	     
	     // To print the current url of the webpage
	     String url1 = driver.getCurrentUrl();
	     System.out.println("The current url of the webpage is:==>"+url1);
	     
	     // To find out number of hyperlinks on the webpage
	     List<WebElement> ls = driver.findElements(By.tagName("a"));
	     int count = ls.size();
	     System.out.println("The number of hyperlinks on the webpage are:==>"+count);
	     
	     System.out.println("----------------------------------------------------------------------------------------------");
	     
	     // For firstname input textbox
	     WebElement fname = driver.findElement(By.cssSelector("input[id='u_0_j']"));//By tagname,attribute,value
	     fname.sendKeys("Radha");
	     
	     // To get the firstname Attribute value
	     String fnameval = fname.getAttribute("value");
	     System.out.println("The user entered value in the firstname textbox is:==>"+fnameval);
	     
	     System.out.println("----------------------------------------------------------------------------------------------");
	     
	     // For lastname input textbox
	     WebElement lname = driver.findElement(By.cssSelector("input#u_0_l")); //By tagname,ID
	     lname.sendKeys("solunke");
	     
	     // To get the lastname Attribute value
	     String lnameval = lname.getAttribute("value");
	     System.out.println("The user entered value in the lastname textbox is:==>"+lnameval);
	     
	     System.out.println("----------------------------------------------------------------------------------------------");
	     
	     // For Email input textbox
	     WebElement email = driver.findElement(By.cssSelector("div#u_0_n>div input"));//By tagname,ID
	     email.sendKeys("radhasol123@gmail.com");
	     
	     // To get the Email Attribute value
	     String emailval = email.getAttribute("value");
	     System.out.println("The user entered value in the email textbox is:==>"+emailval);
	    }
  }


