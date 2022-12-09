package whatsapptest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class register {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://freecampsites.net/");
		driver.close();
	
	
	}

}
