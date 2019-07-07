package Testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardMouse_Operation {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://demo.actitime.com/login.do");
	Thread.sleep(5000);
	//creating an object of robot class
	Robot r=new Robot();
	//move the mouse by x and y coordinate
	r.mouseMove(300, 500);
	//press alt key from keyboard
	r.keyPress(KeyEvent.VK_ALT);
	//press f key from key board
	r.keyPress(KeyEvent.VK_F);
	//release f
	r.keyRelease(KeyEvent.VK_F);
	//release alt key
	r.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(3000);
	//press w to open a new private window
	r.keyPress(KeyEvent.VK_W);
	//release w
	r.keyRelease(KeyEvent.VK_W);
	//Thread.sleep(3000);
	//it will close only the current browser window
	driver.close();
	//it will close all the browser window
	driver.quit();
	
	

}
}
