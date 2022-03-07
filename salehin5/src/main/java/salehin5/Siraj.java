package salehin5;

import java.time.Duration;
import java.util.List;

import javax.swing.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.eventbus.AllowConcurrentEvents;

public class Siraj {
	WebDriver driver;
	public void driverSetup () {
		
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive - ReliSource Inc\\Automation\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	
		}catch(Exception e ) {
		System.out.println(e);
		}
	}
	public void login(){
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://maportaltest.medavante.net/");
			String user = "r_gadmin";
			String pass = "#2Pencil";
			driver.findElement(By.xpath("//*[@id=\"WebLogin_UserName\"]")).sendKeys(user);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
			driver.findElement(By.xpath("//input[@id='WebLogin_Login']")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void table() {
		

		try {
			WebElement Configure = new WebDriverWait(driver, Duration.ofSeconds(100))
			        .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='CONFIGURE']")));
		
			Configure.click();


			WebElement StudySetup = new WebDriverWait(driver, Duration.ofSeconds(100))
					        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Study Setup']")));
			StudySetup.click();

				
			WebElement Studies = new WebDriverWait(driver, Duration.ofSeconds(100))
					        .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Studies']")));
			Studies.click();	
					
					
			WebElement Search = new WebDriverWait(driver, Duration.ofSeconds(300))
			        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"portal-grid-page-content\"]/div[3]/div[2]/input")));
			Search.sendKeys("Dry");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//span[normalize-space()='TEST Dry- Virgil Study Configuration-02']")).click();
		//Applications 
			driver.findElement(By.xpath("//a[normalize-space()='Applications']")).click();
			
			
				//Terms & Conditions
			driver.findElement(By.xpath("//button[@data-ng-click='openEditPatientAppRegistrationSettingsDialog()']//span[@class='icon-small icon-edit']")).click();
			
			driver.switchTo().activeElement();
			Thread.sleep(20000);
			boolean terms= driver.findElement(By.xpath("//*[@id=\"termsAndConditionsCheckbox\"]")).isSelected();
			String termsString = "";
			System.out.println("Terms and conditions");
			if(terms== true)
			{
				//termsString = "Y";
				System.out.println("Y");
			}
			else
			{
				//termsString = "N";
				System.out.println("N");
			}
			driver.findElement(By.xpath("//div[@class='modal-content']//span[@class='ng-binding'][normalize-space()='Cancel']")).click();
			driver.switchTo().defaultContent();

			//Top Menu:Subject
			
			driver.findElement(By.xpath("//button[@data-ng-click='openEditPatientAppPrimarySettingsDialog()']//span[@class='icon-small icon-edit']")).click();
			driver.switchTo().activeElement();
			Thread.sleep(20000);
			boolean topMenuSubjectHome= driver.findElement(By.xpath("//input[@id='homeCheckbox']")).isSelected();
			//String topMenuHomeString = "";
			System.out.println("Tope Menu: Subject -");
			if(topMenuSubjectHome== true)
			{
				//termsString = "Y";
				System.out.println("Subject : Home checked");
			}
			else
			{
				//termsString = "N";
				System.out.println("Subject : Home is not checked");
			}
			
			System.out.println("Questionnaires");

			
			boolean topMenuSubjectMessages= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/div[1]/input[1]")).isSelected();
			//String topMenuHomeString = "";
			if(topMenuSubjectMessages== true)
			{
				//termsString = "Y";
				System.out.println("Subject : Messages checked");
			}
			else
			{
				//termsString = "N";
				System.out.println("Subject : Messages is not checked");
			}
			
			boolean topMenuSubjectLogEvent= driver.findElement(By.xpath("//input[@id='logAnEventCheckbox']")).isSelected();
			//String topMenuHomeString = "";
			if(topMenuSubjectLogEvent== true)
			{
				//termsString = "Y";
				System.out.println("Subject :Log an Event is checked");
			}
			else
			{
				//termsString = "N";
				System.out.println("Subject :Log an Event is not checked");
			}
			
			//Top Menu:Observer
			//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]")).click();
			boolean topMenuObserverHome= driver.findElement(By.xpath("//input[@id='homeObserverCheckbox']")).isSelected();
			//String topMenuHomeString = "";
			System.out.println("Tope Menu: Observer -");
			if(topMenuObserverHome== true)
			{
				//termsString = "Y";
				System.out.println("Obsever : Home is checked");
			}
			else
			{
				//termsString = "N";
				System.out.println("Obsever : Home is not checked");
			}
			
			System.out.println("Questionnaires");
			
			boolean topMenuObserverQuestionnaires= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[3]/div[1]/form[1]/div[2]/div[3]/div[1]/span[1]")).isSelected();
			//String topMenuHomeString = "";
			if(topMenuObserverQuestionnaires == true)
			{
				//termsString = "Y";
				System.out.println("Observer : Questionnaires is checked");
			}
			else
			{
				//termsString = "N";
				System.out.println("Observer : Questionnaires is not  checked");
			}
			
			boolean topMenuObserverMessages= driver.findElement(By.xpath("//input[@id='messagesObserverCheckbox']")).isSelected();
			//String topMenuHomeString = "";
			if(topMenuObserverMessages== true)
			{
				//termsString = "Y";
				System.out.println("Observer : Messages is checked");
			}
			else
			{
				//termsString = "N";
				System.out.println("Observer : Messages is not  checked");
			}
			
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
			//
			//Top Menu: Show in Home Section
			
			System.out.println("Top Menu: Show in Home Section -");
			
			
			boolean PendingQuestionnaire = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[3]/div[2]/form[1]/div[2]/div[1]/div[1]/span[2]/div[1]/input[1]")).isSelected();
			//String topMenuHomeString = "";
			if(PendingQuestionnaire == true)
			{
				//termsString = "Y";
				System.out.println("PendingQuestionnaire is checked");
			}
			else
			{
				//termsString = "N";
				System.out.println("PendingQuestionnaire is not checked");
			}
			
			
		
			boolean NextQuestionnaire = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[3]/div[2]/form[1]/div[2]/div[1]/div[1]/span[2]/div[1]/input[1]")).isSelected();
			//String topMenuHomeString = "";
			if(NextQuestionnaire == true)
			{
				//termsString = "Y";
				System.out.println("Next Questionnaire is checked");
			}
			else
			{
				//termsString = "N";
				System.out.println("PendingQuestionnaire is not checked");
			}
			
			
			boolean unreadMessages = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[3]/div[2]/form[1]/div[2]/div[3]/div[1]/span[2]/div[1]/input[1]")).isSelected();
			//String topMenuHomeString = "";
			if(unreadMessages == true)
			{
				//termsString = "Y";
				System.out.println("Unread Messages");
			}
			else
			{
				//termsString = "N";
				//System.out.println("PendingQuestionnaire");
			}
			
			boolean recentMessages = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[3]/div[2]/form[1]/div[2]/div[4]/div[1]/span[2]/div[1]/input[1]")).isSelected();
			//String topMenuHomeString = "";
			if(recentMessages == true)
			{
				//termsString = "Y";
				System.out.println("Recent Messages");
			}
			else
			{
				//termsString = "N";
				//System.out.println("PendingQuestionnaire");
			}
			
			boolean nextVisit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[3]/div[2]/form[1]/div[2]/div[5]/div[1]/span[2]/div[1]/input[1]")).isSelected();
			//String topMenuHomeString = "";
			if(nextVisit == true)
			{
				//termsString = "Y";
				System.out.println("Next Visit");
			}
			else
			{
				//termsString = "N";
				System.out.println("next Visit");
			}
			
			
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
			
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
			
			driver.findElement(By.xpath("//button[@class='btn btn-active btn-save btn-without-icon']//span[@class='ng-binding'][normalize-space()='Save']")).click();
			driver.switchTo().defaultContent();
			
			
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	
//		try {
//			WebElement Configure = new WebDriverWait(driver, Duration.ofSeconds(100))
//			        .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='CONFIGURE']")));
//		
//			Configure.click();
//
//
//			WebElement StudySetup = new WebDriverWait(driver, Duration.ofSeconds(100))
//					        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Study Setup']")));
//			StudySetup.click();
//
//				
//			WebElement Studies = new WebDriverWait(driver, Duration.ofSeconds(100))
//					        .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Studies']")));
//			Studies.click();	
//					
//					
//			WebElement Search = driver.findElement(By.xpath("//*[@id=\"portal-grid-page-content\"]/div[3]/div[2]/input"));
//			Search.sendKeys("Dry");
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//span[normalize-space()='TEST Dry- Virgil Study Configuration-01']")).click();
//			
//			driver.findElement(By.xpath("//a[normalize-space()='Custom']")).click();
//			driver.findElement(By.xpath("//div[@data-text-id='Models.studyCustom.assessmentStartDateDisable']//span")).click();
//			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[3]/div[1]/h4[1]")).click();
//			
//			WebElement ModalityTable = driver.findElement(By.xpath("//*[@id=\"collapse_2\"]/div/div[2]/div/div/div[2]/table"));
//			
//			
//			
//			int ModalityOptionsReasonlen = ModalityTable.findElements(By.tagName("span")).size();
//			String EChangeModalityOptionsBeforeXpath = "//*[@id=\"collapse_2\"]/div/div[2]/div/div/div[2]/table/tbody/tr[";
//			String EChangeModalityOptionsAfterXpath = "]/td[1]/span";
//			String EChangeModalityOptions = "";
//			for(int i = 1 ; i<=ModalityOptionsReasonlen ; i++) {
//				
//				String xpath = EChangeModalityOptionsBeforeXpath+i+EChangeModalityOptionsAfterXpath;
//				WebElement el = driver.findElement(By.xpath(xpath));
//				EChangeModalityOptions += el.getText()+"\n";
//				
//				
//			}
//			System.out.println("Reasons : \n"+EChangeModalityOptions);
//			
//			int ModalityOptionsReasonCoommentlen = ModalityTable.findElements(By.tagName("tr")).size();
//			String EChangeModalityCommentsBeforeXpath = "//*[@id=\"collapse_2\"]/div/div[2]/div/div/div[2]/table/tbody/tr[";
//			String EChangeModalityCommentsAfterXpath = "]/td[2]";
//			String EChangeModalityComments = "";
//			
//			for(int i=1; i<=ModalityOptionsReasonCoommentlen ; i++) {
//				String xpath = EChangeModalityCommentsBeforeXpath+i+EChangeModalityCommentsAfterXpath;
//				WebElement el = driver.findElement(By.xpath(xpath));
//				EChangeModalityComments += el.getText()+"\n";
//			}
//			System.out.println("Reason comments : \n"+EChangeModalityComments);
//
//		}catch(Exception e) {
//			System.out.println(e);
//			driver.close();
//		}
	}
	
	public void close() {
		
		//driver.close();
		driver.quit();
	}
	public static void main(String[] args) {
		
		Siraj obj = new Siraj();
		obj.driverSetup();
		obj.login();
		obj.table();
		obj.close();
		
	}

}
