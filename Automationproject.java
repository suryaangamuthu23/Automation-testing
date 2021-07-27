package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automationproject
{

	public static void main(String[] args) throws InterruptedException
	{
	  //LAUNCH WEBSITE...
                 System.setProperty("webdriver.chrome.driver","C:\\seleniumwebdriver\\chromedriver\\chromedriver.exe");
                 WebDriver driver=new ChromeDriver();
                 driver.get("https://www.justdial.com/sideMenu");
                 System.out.println("Launching website");
    
      // MAXIMIZE THE WINDOW...
                 driver.manage().window().maximize();
                 System.out.println("Maximize the window");
    
     // CHECKING COVID HELPLINE...
                 driver.findElement(By.xpath("//span[@id='hotkeys_text_0']")).click();
                 System.out.println("checking covid19helplinenumber for all the states");
                 Thread.sleep(600);
    
     // SCROLL DOWN...
                 JavascriptExecutor js=(JavascriptExecutor) driver;
                 js.executeScript("window.scrollBy(0, 1000)");
                 Thread.sleep(2000);
                 System.out.println("Scroll down");
    
     // SCROLL UP...
                 js.executeScript("window.scrollBy(0, -1000)");
                 Thread.sleep(2000);
                 System.out.println("Scroll up");
    
     // CHECKING COVID RESOURCES...
                driver.findElement(By.xpath("//a[contains(text(),'Covid Resources')]")).click();
                System.out.println("Checking  the covid resources");
    
    //  DROP DOWM...
                WebElement drpdown=driver.findElement(By.xpath("//input[@id='citySearch']"));
                drpdown.click();
                driver.findElement(By.xpath("//*[@id=\"popularCity\"]/ul/li[6]/div[1]")).click(); 
                System.out.println("Using dropdown method Searching covid resources for chennai district");
                Thread.sleep(1000);
                System.out.println("checking what are the covid resources are available");
    
    // CHECKING HOSPITAL BEDS...
                driver.findElement(By.xpath("//body/div[@id='resources']/div[@id='category']/ul[1]/li[3]")).click(); 
                Thread.sleep(5000);
    
    // SCROLL DOWN...
                js.executeScript("window.scrollBy(0, 400)");
                Thread.sleep(2000);
                js.executeScript("window.scrollBy(0, 400)");
                Thread.sleep(2000);
    
    // SCROLL UP...
                js.executeScript("window.scrollBy(0, -600)");
                System.out.println("checking for hospital beds");
    
    // CHECKING VACCINATION CENTRE...
                driver.findElement(By.xpath("//a[contains(text(),'Vaccination Centers')]")).click();
                System.out.println("Checking vaccinations centre");
                driver.findElement(By.xpath("//a[contains(text(),'Search by Pincode')]")).click();
    
    // USING SENDKEYS CHECKING VACCINATION FOR PARTICULAR AREA
               driver.findElement(By.xpath("//body/div[@id='centers']/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("636010");
               driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
               System.out.println("Checking vaccination centre for particular area using pincodes with the help of sendkeys");
               Thread.sleep(5000);
    
     //SCROLL DOWN
               js.executeScript("window.scrollBy(0, 300)");
               Thread.sleep(3000);
               js.executeScript("window.scrollBy(0, 300)");
               Thread.sleep(3000);
    
    // SCROLL UP
               js.executeScript("window.scrollBy(0, -600)");
    
    // CHECKING COVID SYMPTOMS
               driver.findElement(By.xpath("//a[contains(text(),'Symptoms')]")).click();
               System.out.println("Checking for covidsymptoms");
               Thread.sleep(2000);
   
    // CHECKING DO AND DON'TS...
               driver.findElement(By.xpath("//a[contains(text(),\"Do's and Don'ts\")]")).click();
               System.out.println("Checking for do and dont's");
               Thread.sleep(2000);
   
    // CHECKING LIVE STATUS...
               driver.findElement(By.xpath("//a[contains(text(),'Live Status')]")).click();
               System.out.println("Checking for live status");
    
    // SCROLL DOWN
              js.executeScript("window.scrollBy(0, 500)");
              Thread.sleep(1000);
              js.executeScript("window.scrollBy(0, 500)");
              Thread.sleep(3000);
              js.executeScript("window.scrollBy(0, 500)");
              Thread.sleep(3000);
              js.executeScript("window.scrollBy(0, 500)");
              Thread.sleep(3000);
              js.executeScript("window.scrollBy(0, 500)");
              Thread.sleep(3000);
    
    // SCROLL UP...
              js.executeScript("window.scrollBy(0, -25000)");
    
    // NAVIAGATE TO BACK
              driver.navigate().back();
    
    //   CLOSE...
              driver.close();
   }
}




