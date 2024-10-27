package assessment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Analysis {
	
	
	
	@Test
	public void createAccount() throws InterruptedException {
	    ChromeOptions a= new ChromeOptions();
	    a.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(a);
		driver.get("https://www.nba.com/stats");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//button[text()='I Accept']")).click();
		
		driver.findElement(By.xpath("//a[text()='See All Player Stats']")).click();
		
		WebElement modal=driver.findElement(By.xpath("//div[contains(@id,'bx-campaign-ally-title') and text()='Click to subscribe to League Pass' ]/following-sibling::button"));
		
		
		
		
		
		
		
		
		
		
		
		//Choose 'Season' as '2023-24'
       Select dp1 = new Select(driver.findElement(By.xpath("//p[text()='Season']//parent::label//descendant::select")));
       dp1.selectByVisibleText("2023-24");
       
       //Choose 'Season Type' as 'NBA Cup'

	
       Select dp2 = new Select(driver.findElement(By.xpath("//p[text()='Season Type']//parent::label//descendant::select")));
       dp2.selectByVisibleText("NBA Cup");
       //Choose 'Per Mode' as 'Per Game'

       Select dp3 = new Select(driver.findElement(By.xpath("//p[text()='Per Mode']//parent::label//descendant::select")));
       dp3.selectByVisibleText("Per Game");
       
       Select dp4 = new Select(driver.findElement(By.xpath("//p[text()='Season Segment']//parent::label//descendant::select")));
       dp4.selectByVisibleText("Last Game");
       
       try {
       WebDriverWait wait1= new  WebDriverWait(driver, Duration.ofSeconds(10));
       wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id,'bx-campaign-ally-title') and text()='Click to subscribe to League Pass' ]/following-sibling::button")));
       wait1.until(ExpectedConditions.stalenessOf(modal));
       WebElement ck= driver.findElement(By.xpath("//div[contains(@id,'bx-campaign-ally-title') and text()='Click to subscribe to League Pass' ]/following-sibling::button"));
	   ck.click();
	   System.out.println("closed modal");
	  
       }catch(Exception e) {
    	  e.printStackTrace();
    	   
    	   
       }
   		
   		
   		
       
       
       
       
       
       
       
       
       
       
       
       
       
       List<Integer> ages=new ArrayList<>();
       List<WebElement>ak=driver.findElements(By.xpath("//table[@class='Crom_table__p1iZz']//tbody/tr/td[3]/following::td[1]"));
       
       int s=ak.size();
       
      for(int i=0;i<s;i++) {
    	  
    	  int age=Integer.parseInt(ak.get(i).getText());
    	  ages.add(age);
    	  
    	  
      }
	
	Collections.sort(ages);
	
	for(int num:ages) {
	System.out.println(num);

	driver.findElement(By.xpath("//table[@class='Crom_table__p1iZz']//tbody/tr/td[2]"));
	
	}
	
	
	
	
  	  
String player=driver.findElement(By.xpath("//table[@class='Crom_table__p1iZz']//tbody/tr/td[3]/following::td[text()='"+ages.get(0)+"']//preceding-sibling::td[2]/a")).getText();
System.out.println("player "+player);
    
	driver.findElement(By.xpath("//table[@class='Crom_table__p1iZz']//tbody/tr/td[2]/a[text()='"+player+"']")).click();
	
	WebDriverWait bn= new  WebDriverWait(driver, Duration.ofSeconds(10));
	bn.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//div[contains(@id,'bx-campaign-ally-title-2752270')]/following-sibling::button"))));
	driver.findElement(By.xpath("//div[contains(@id,\"bx-campaign-ally-title-2752270\")]/following-sibling::button")).click();
	String exp=driver.findElement(By.xpath("(//p[text()='EXPERIENCE']//following-sibling::p)[1]")).getText();
	System.out.println(exp);
	}}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
