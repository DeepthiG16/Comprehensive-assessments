package Automation.Comprehensive1;

        import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class TestCase1 {
				    public static void main(String[] args) throws InterruptedException {
				    	
				    	//System.setProperty("webdriver.chrome.driver","?C:\\browser\\chromedriver.exe?????????");
				    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				    WebDriver driver=new ChromeDriver();
		    	driver.get("https://www.urbanladder.com/");		    	
		    	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//a[@ class='signup-link authentication_popup']")).click();   	    	
		    	
		    	Thread.sleep(5000);	    	
		    	driver.findElement(By.cssSelector("#spree_user_email")).click();		    	
		    	driver.findElement(By.cssSelector("#spree_user_email")).sendKeys("deepthigurumurthi@gmail.com");
	    	driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).click();		    	
	    	driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).sendKeys("Deepu@1606");
		    	
		    	driver.findElement(By.xpath("(//input[@name='commit'])[2]")).click();
		    	Thread.sleep(2000);
		    	driver.close();
				    }
				}

				








