package LoginPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Student 
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		 System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
		 
		// To load the url here
	    driver.get("file:///E:/Swati%20Study%20Material/Swati%20Study%20Material/Html%20program/Xpath.html");
	    
	    // To maximize browser
	    driver.manage().window().maximize();
	    
	    // To print the current url of the webpage
	    String url = driver.getCurrentUrl();
	    System.out.println("The current url of webpage is:==>"+url);
	    
	    // To print the current title of the webpage 
	    String title = driver.getTitle();
	    System.out.println("The current title of the webpage is:==>"+title);
	    
	    // To find out the hyperlinks on wepage
	    List<WebElement> ls =driver.findElements(By.tagName("a"));
	    int count = ls.size();
	    System.out.println("The number of hyperlinks on webpage are:==>"+count);
	     
	    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
	   
	    // For firstname label
	    WebElement fnamelb = driver.findElement(By.cssSelector("div.container>label[for='username']"));   // By tagname,classvalue and tagname,attribute,value
	    //WebElement fnamelb = driver.findElement(By.cssSelector("div.container >label :nth-of-type(1)")); // nth-of-type(1)
	    String fname = fnamelb.getText();
	    System.out.println("The firstname label value is:==>"+fname);
	    
	    // For Firstname input textbox.....
	    WebElement firstname = driver.findElement(By.cssSelector("div.container>label[for='username']+input")); 
	    // By tagname,classvalue and tagname,attribute,valueand sibling locator used here
	    firstname.sendKeys("shree");
	    Thread.sleep(2000);
	    
	    // For firstname getAttribute
	    String fnameval = firstname.getAttribute("value");
	    System.out.println("The user entered value in textbox is:==>"+fnameval);
	    
	    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
	    
	    // For password label
	    WebElement passwdlb = driver.findElement(By.cssSelector("div.container :nth-child(5)")); // nth-child
	    String passwd = passwdlb.getText();
	    System.out.println("The password label is:==>"+passwd);
	    
	    // For Password input text box
	    WebElement password = driver.findElement(By.cssSelector("input.password")); // tagname and id
	    password.sendKeys("password@1234");
	    Thread.sleep(2000);
	    
	    // For pssword getAttribute
	    String passwdval = password.getAttribute("value");
	    System.out.println("The user entered password value in password text box is:==>"+passwdval);
	    
	    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
	    
	    // For selecting the dropdown 
	    WebElement dropdown1 = driver.findElement(By.cssSelector("select[id='browser']"));   // tagname,attribute,value
	    Select sel1 = new Select(dropdown1);
	    sel1.selectByVisibleText("Chrome");
	    Thread.sleep(2000);
	    
	    WebElement dropdown2 = driver.findElement(By.cssSelector("select[id='browser']")); // tagname,attribute,value
	    Select sel2 = new Select(dropdown2);
	    sel2.selectByValue("firefox");
	    Thread.sleep(2000);
	    
	    WebElement dropdown3 = driver.findElement(By.cssSelector("select[id='browser']"));  // tagname,attribute,value
	    Select sel3 = new Select(dropdown3);
	    sel3.selectByIndex(2);
	    Thread.sleep(2000);
	    
	    // For Remember me checkbox
	    driver.findElement(By.cssSelector("input[name*='Rem']")).click();   // By match with partial substring
	    Thread.sleep(2000);
	    
	    // For Login button
	    driver.findElement(By.cssSelector("button[onclick^='alert']")).click();  //By match with prefix
	    Thread.sleep(2000);
	    
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    String url1 = driver.getCurrentUrl();
	    System.out.println("After login the current url is:==>"+url1);
	    
	   
	    driver.navigate().back();
	    String url2 =driver.getCurrentUrl();
	    System.out.println("After navigating back the current url of this page is:==>"+url2);
	    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
	    
	    // For cancle button
	    driver.findElement(By.cssSelector(" button[name$='cle']")).click();   // by match with the suffix value
	    // For Forgot password linking
	    driver.findElement(By.cssSelector("a[href*='forgo']")).click();    // By partial-substring
	    String url3 = driver.getCurrentUrl();
	    System.out.println("The current url of this webpage after clicking on forgot password is:==>"+url3);
	    Thread.sleep(2000);
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    String url4 = driver.getCurrentUrl();
	    System.out.println("After navigating back thr current url of webpage is:==>"+url4);
	    
	    // driver.close();

     }
}
