package TestKanbanBoard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExecuted  {

	public WebDriver driver;
    BasePage base;

    
    
	@Before

	public void setup() {

		// System.setProperty("webdriver.chrome.whitelistedIps", "");

		driver = new ChromeDriver();
		driver.get("https://kanban-board-two.vercel.app/");
		driver.manage().window().maximize();

		base = new BasePage(driver);

	}

	@Test
	public void TestCreatingNewTicket() {

		base.addNewTicket();
		assertTrue(base.newTicketIsCreated.isDisplayed());

	}

	@Test
	public void TestDragAndDrop() {

		base.dragDrop();
		base.dragDrop2();
		assertTrue(base.NumberTicket2.getText().contains("1"));
		assertTrue(base.NumberTicket3.getText().contains("1"));

	}

	@Test
	public void TestEditTicket() {

		base.emptyTicketField();
		assertEquals("HELLO!", base.editTicket.getText());

	}

	@Test
	public void TestHoveringTicketDisplaysXButton() {

		base.moveHoverIcon();
		assertTrue(base.deleteTicketElement.isDisplayed());

	}

	@Test
	public void TestDeleteIcon() {

		base.moveHandOnDelete();
		base.clickDeleteButton();
		assertFalse(base.deleteElement.isDisplayed());
	}

	@Test
	public void NumberOfTicketShown() {

		base.numberOfTicketsShown.isDisplayed();

	}

	@After
	public void testCleanup() {

		driver.close();
		driver.quit();

	}
}
