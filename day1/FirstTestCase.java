package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 Test Case
 1) Launch Browser(chrome)
 2) Open Url https://demo.opencart.com/
 3) validate title should be "Your Store"
 4) Close browser
*/

public class FirstTestCase{
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		if(title.equals("Your Store")) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		driver.close();
	}
}

