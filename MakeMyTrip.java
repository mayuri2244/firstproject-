package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MakeMyTrip {
	

		public static void main(String[] args) throws InterruptedException {
			
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\PCC\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			//Open Website
			driver.get("https://www.makemytrip.com/flights/");
			Thread.sleep(2000);
			//get title 
			String title = driver.getTitle();
			System.out.println("Title of the page is: " + title);
			//get url
			String url = driver.getCurrentUrl();
			System.out.println("URL of the page is: " + url);
			
			driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div[2]")).click();
		
			
			//click span
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]")).click();
			//input From
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Delhi");
			//click span
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]/span[1]")).click();
			//input TO
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Bengaluru");
			
			// Selecting Date
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[5]/div[1]/div[1]/p[1]")).click();
			
			//Selecting Class	
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/label[1]/span[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[3]")).click();	
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[2]/button[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/p[1]/a[1]")).click();
			//pop-up
			Thread.sleep(3000);
			try{
			driver.findElement(By.cssSelector(".button.buttonSecondry.buttonBig.fontSize12.relative")).click();
			}
			catch (NoAlertPresentException E){
			E.printStackTrace();
			}
			
			//view prize
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]")).click();
			
			Thread.sleep(3000);
			driver.quit();
			

		  }

		}