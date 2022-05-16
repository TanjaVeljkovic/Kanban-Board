package TestKanbanBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	protected By pageLink = By.xpath("https://kanban-board-two.vercel.app/");
	protected By addNewTicketIcon = By.xpath("//div[@class='sc-AxheI dNrDWH']/button[@aria-label='Add new ticket']");
	protected By newTicketCreated = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div[1]/div");
	protected By dragTicket = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div[1]");
	protected By drop1 = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]");
	protected By drop2 = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[2]");
	protected By editTicketContent = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div[1]/div/textarea");
	// protected By emptyTicketContent = By.className("sc-AxhCb gyMAAG");
	protected By hoverTicket = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div[1]/div/span");
	protected By deleteTicketIcon = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div[1]/div/button");
	protected By numberOfTicketsinColumn1 = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[1]/div");
	protected By numberOfTicketsinColumn2 = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div");
	protected By numberOfTicketsinColumn3 = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[1]/div");

	WebElement newTicketElement = driver.findElement(addNewTicketIcon);
	WebElement newTicketIsCreated = driver.findElement(newTicketCreated);

	Actions action = new Actions(driver);

	public void addNewTicket() {
		action.click(newTicketElement).perform();
	}

	WebElement dragThisTicket = driver.findElement(dragTicket);
	WebElement dropToThisColumn = driver.findElement(drop1);
	WebElement dropToOtherColumn = driver.findElement(drop2);

	WebElement NumberTicket1 = driver.findElement(numberOfTicketsinColumn1);
	WebElement NumberTicket2 = driver.findElement(numberOfTicketsinColumn2);
	WebElement NumberTicket3 = driver.findElement(numberOfTicketsinColumn3);

	public void dragDrop() {
		action.dragAndDrop(dragThisTicket, dropToThisColumn).perform();
	}
	// drag and drop

	public void dragDrop2() {
		action.dragAndDrop(dragThisTicket, dropToOtherColumn).perform();

	}

	// WebElement emptyTicket = driver.findElement(emptyTicketContent);
	WebElement editTicket = driver.findElement(editTicketContent);

	public void emptyTicketField() {
		action.doubleClick(editTicket).perform();
		editTicket.sendKeys("HELLO!");
	}

	WebElement ticketElement = driver.findElement(hoverTicket);

	public void moveHoverIcon() {
		action.moveToElement(ticketElement).perform();
	}

	WebElement deleteTicketElement = driver.findElement(deleteTicketIcon);

	WebElement deleteElement = driver.findElement(deleteTicketIcon);

	public void moveHandOnDelete() {
		action.moveToElement(ticketElement).perform();
	}

	public void clickDeleteButton() {

		action.click(deleteElement).perform();

	}

	WebElement numberOfTicketsShown = driver.findElement(numberOfTicketsinColumn1);

	public void numberOfTicketVisable() {

		action.click(newTicketElement).perform();

	}

}