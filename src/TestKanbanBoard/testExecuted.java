package TestKanbanBoard;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testExecuted {
	

	//private static final String Assert = null;
	//private static final String Assume = null;
	//private static final String WebDriverManager = null;
//	private WebDriver driver;
	//private static String PAGE_URL = "https://kanban-board-two.vercel.app/";
//	protected By pageLink = By.xpath("https://kanban-board-two.vercel.app/");
//	protected By addNewTicketIcon = By.className("sc-Axmtr hvJMgY"); 
	//	protected By newTicketCreated = By.className("sc-AxjAm jOSNSb");
	//protected By dragTicket = By.xpath("//*[@id=\\\"root\\\"]/div/div/div/div[1]/div[2]/div[1]");
	//protected By drop1 = By.className("sc-fzoLsD bmXcrz"); 
	//protected By drop2 = By.className("sc-fzoLsD iFWCam");
	//protected By editTicketContent = By.className("sc-AxjAm eMIbNL");
	//protected By emptyTicketContent = By.className("sc-AxhCb gyMAAG");
	//protected By hoverTicket = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div[1]/div/span");
	//protected By deleteTicketIcon = By.className("sc-AxiKw eSbheu");
	//protected By numberOfTicketsinColumn1 = By.className("sc-fzozJi dteCCc");
	//protected By numberOfTicketsinColumn2 = By.className("sc-fzozJi dteCCc");
	//protected By numberOfTicketsinColumn3 = By.className("sc-fzozJi dteCCc");
	
//	private By panelHeading = By.className("panel-heading");
	public WebDriver driver;
	BasePage base;
	  //BasePage base = new BasePage(driver); 
	  //WebDriver driver;
	
	@Before
    //public void setup(){
	 
		public void setup(){
		   
		    //System.setProperty("webdriver.chrome.whitelistedIps", "");
	
		
		driver = new ChromeDriver();
			driver.get("https://kanban-board-two.vercel.app/");
			driver.manage().window().maximize();

			base = new BasePage(driver);
				
	    }
		
		
		//System.setProperty("webdriver.chrome.driver ", "C:\\browserdrivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://kanban-board-two.vercel.app/");
		
			
	   
    //}

	 @Test
	    public void TestCreatingNewTicket () {
	    
	    	//WebElement newTicketElement = driver.findElement(addNewTicketIcon);
	    	
	    	//Actions action = new Actions(driver);
	    	
	        //action.click(newTicketElement).perform(); // click action
	        base.addNewTicket();
	        assertTrue(base.newTicketIsCreated.isDisplayed());
	       // assertTrue(base.numberChanges.getText("1")); 
	        //assertEquals("1",numberChanges.getText());
	 }
	 
	 @Test
	   public void TestDragAndDrop (){
		 
	   //WebElement  dragThisTicket = driver.findElement(dragTicket);
	  // WebElement dropToThisColumn = driver.findElement(drop1);
	  // WebElement dropToOtherColumn = driver.findElement(drop2);
	   
	  // WebElement NumberTicket1 = driver.findElement(numberOfTicketsinColumn1);
	 // WebElement NumberTicket2 = driver.findElement(numberOfTicketsinColumn2);
	//   WebElement NumberTicket3 = driver.findElement(numberOfTicketsinColumn3);
	   
	   //Actions action = new Actions(driver); 
	 //  action.dragAndDrop(dragThisTicket, dropToThisColumn).perform();// drag and drop
	   
	   
	   
	 //  action.dragAndDrop(dragThisTicket, dropToOtherColumn).perform(); 
	 
	   
	   base.dragDrop();
	   base.dragDrop2();
	   assertTrue(base.NumberTicket2.getText().contains("0"));
	   assertTrue(base.NumberTicket3.getText().contains("1"));
	   
	   
	 
	 }
	   
	 
	 
	 @Test
		public void TestEditTicket() {
		 
		 //WebElement emptyTicket = driver.findElement(emptyTicketContent); 
		// WebElement editTicket = driver.findElement(editTicketContent); 
		
		//Actions action = new Actions(driver);
		//action.doubleClick(emptyTicket).perform();
		
		//editTicket.sendKeys("HELLO!");
		
		 base.emptyTicketField();
	     assertEquals("HELLO!",base.editTicket.getText());
	 
	 }
	 @Test
		public void TestHoveringTicketDisplaysXButton() {
			//WebElement ticketElement = driver.findElement(hoverTicket);

			//Creating object of an Actions class
			//Actions action = new Actions(driver);

			//Performing the mouse hover action on the target element.
			//action.moveToElement(ticketElement).perform();

			//WebElement deleteTicketElement = driver.findElement(deleteTicketIcon);

			// check if buttonElement is visible
		 
		    base.moveHoverIcon();
			assertTrue(base.deleteTicketElement.isDisplayed()); 
			
			}
	 
	
	
	 
	  @Test
		public void TestDeleteIcon() {
	
		//WebElement deleteElement = driver.findElement(deleteTicketIcon);
		//Actions action = new Actions(driver);
		
		//action.moveToElement(ticketElement).perform();
		//action.click(deleteElement).perform();
	
		
		
		//assertNull(driver.findElement(deleteTicketIcon));
		  
		base.moveHandOnDelete();
		base.clickDeleteButton();
        assertFalse(base.deleteElement.isDisplayed());
	 }
	
	
    
	  
	   
   
	@After 
	public void testCleanup() {
// Do your cleanup here like close URL connection , releasing resources etc
	driver.close();
	driver.quit();


}
}

