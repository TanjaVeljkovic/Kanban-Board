package TestKanbanBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


//private static final String Assert = null;
	//private static final String Assume = null;
	//private static final String WebDriverManager = null;
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//private static String PAGE_URL = "https://kanban-board-two.vercel.app/";
	protected By pageLink = By.xpath("https://kanban-board-two.vercel.app/");
	//protected By addNewTicketIcon = By.className("sc-Axmtr hvJMgY");  
	protected By addNewTicketIcon = By.xpath("//div[@class='sc-AxheI dNrDWH']/button[@aria-label='Add new ticket']");
	//protected By newTicketCreated = By.className("sc-AxjAm jOSNSb");
	protected By newTicketCreated = By.className("//div[@data-testId='ticket']");
	//protected By newTicketCreated = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div[1]/div");
	protected By dragTicket = By.xpath("//*[@id=\\\"root\\\"]/div/div/div/div[1]/div[2]/div[1]");
	protected By drop1 = By.className("sc-fzoLsD bmXcrz"); 
	protected By drop2 = By.className("sc-fzoLsD iFWCam");
	protected By editTicketContent = By.className("sc-AxjAm eMIbNL");
	protected By emptyTicketContent = By.className("sc-AxhCb gyMAAG");
	protected By hoverTicket = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div[1]/div/span");
	protected By deleteTicketIcon = By.className("sc-AxiKw eSbheu");
	protected By numberOfTicketsinColumn1 = By.className("sc-fzozJi dteCCc");
	protected By numberOfTicketsinColumn2 = By.className("sc-fzozJi dteCCc");
	protected By numberOfTicketsinColumn3 = By.className("sc-fzozJi dteCCc");
	
	//private By panelHeading = By.className("panel-heading");
	
	
	WebElement newTicketElement = driver.findElement(addNewTicketIcon);
	WebElement newTicketIsCreated = driver.findElement(newTicketCreated);//nova katica
	//WebElement numberChanges = driver.findElement(numberOfTicketsinColumn1);
	
	Actions action = new Actions(driver); 
	public void addNewTicket() {
		action.click(newTicketElement).perform();		
	}
	
	
	//Actions action = new Actions(driver);
	
     
     WebElement dragThisTicket = driver.findElement(dragTicket);
	 WebElement dropToThisColumn = driver.findElement(drop1);
	 WebElement dropToOtherColumn = driver.findElement(drop2);
	   
	
	 
	 WebElement NumberTicket1 = driver.findElement(numberOfTicketsinColumn1);
	 WebElement NumberTicket2 = driver.findElement(numberOfTicketsinColumn2);
	 WebElement NumberTicket3 = driver.findElement(numberOfTicketsinColumn3);
	   
	//Actions action = new Actions(driver); 
	 public void dragDrop() {
	      action.dragAndDrop(dragThisTicket, dropToThisColumn).perform();  
	 }
	 // drag and drop
	    
	public void dragDrop2(){
		action.dragAndDrop(dragThisTicket, dropToOtherColumn).perform(); 
				
	}
	 
	
	  
	 WebElement emptyTicket = driver.findElement(emptyTicketContent); 
	 WebElement editTicket = driver.findElement(editTicketContent); 
	
	 //Actions action = new Actions(driver);
	 
	 public void emptyTicketField() {
		 action.doubleClick(emptyTicket).perform(); 
		 editTicket.sendKeys("HELLO!");
	 }
	 
	
	
	 WebElement ticketElement = driver.findElement(hoverTicket);

	 //Actions action = new Actions(driver);

	 public void moveHoverIcon(){
		 action.moveToElement(ticketElement).perform();  
	 }
	 

	 WebElement deleteTicketElement = driver.findElement(deleteTicketIcon);

 
	 WebElement deleteElement = driver.findElement(deleteTicketIcon);
	// Actions action = new Actions(driver);
	
	 public void moveHandOnDelete() {
		 action.moveToElement(ticketElement).perform();  
	 }
	 
	public void clickDeleteButton() {
		
		action.click(deleteElement).perform();	
	}
	 

	
	
	
	
	
	
	 
	
	
}