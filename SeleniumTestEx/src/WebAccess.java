import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAccess {
	public static void main(String[] args) throws InterruptedException {
		//load the driver
		System.setProperty("webdriver.chrome.driver", "C:\\IMP DOCUMENTS\\95\\Chrome\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
			//maximise the web browser screen
			wd.manage().window().maximize();
			//load the webpage
			//wd.get("https://www.google.com/");
			//title of webpage what loaded
			//System.out.println(wd.getTitle());
			//load the url
			//System.out.println(wd.getCurrentUrl());
			//wd.findElement(By.linkText("Start here.")).click();
			//wd.findElement(By.id("ap_customer_name")).sendKeys("karthik");
			//wd.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
			//wd.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
			//wd.findElement(By.id("ap_password")).sendKeys("1234567");
			//wd.findElement(By.id("continue")).click();
			//wd.get("C:\\IMP DOCUMENTS\\sel.html");
			//Select sc=new Select(wd.findElement(By.name("subjects")));
			//sc.selectByIndex(2);
			//sc.selectByValue("java");
			//List<WebElement> list=sc.getOptions();
			//for(WebElement we:list) {
			//	System.out.println(we.getText());
			//}


			
			//Thread.sleep(20000);
			
			

			//close the browser
			//wd.close();
			/*
			//webpage level time bound
			wd.manage().timeouts().pageLoadTimeout(200,TimeUnit.MILLISECONDS);
			
			//load the webpage
			wd.get("C:\\IMP DOCUMENTS\\SimpliLearn\\Phase 5\\hi.html");

			//webelements 1.implicit 2.explicit
			//wd.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
			
			WebElement we1=wd.findElement(By.name("user"));
			WebElement we2=wd.findElement(By.name("email"));
			//userdefined method(wd,we,timebound,value)
			explicit(wd,we1,2000,"weird");
			explicit(wd,we2,3000,"spider@g.c");
			*/
			
			//ALERT
			wd.get("C:\\IMP DOCUMENTS\\SimpliLearn\\Phase 5\\alert.html");
			wd.findElement(By.name("submit")).submit();
			Alert alert=wd.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();


	}
	/*public static void explicit(WebDriver wd, WebElement we, int timebound, String sendkeys) {
		// TODO Auto-generated method stub
		new WebDriverWait(wd, timebound).until(ExpectedConditions.visibilityOf(we));
		we.sendKeys(sendkeys);
		
	}*/
	
}
	