import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
// C206 AY2023 SEM1 - Eclipse 21-09 JDK16

public class ResourceCentreTest {
	// prepare test data
	private Camcorder cc1;
	private Camcorder cc2;
	private Camcorder cc3;
	private Chromebook cb1;
	private Chromebook cb2;
	private Chromebook cb3;

	private ArrayList<Camcorder> camcorderList;
	private ArrayList<Chromebook> chromebookList;

	public ResourceCentreTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data
		cc1 = new Camcorder("CC0011", "Nikon HDSLR", 40);
		cc2 = new Camcorder("CC0012", "Sony DSC-RX100M7", 20);
		cc3 = new Camcorder("CC0013", "panasoni DSC-RX100M7", 30);
		cb1 = new Chromebook("CB0011", "My Google Chromebook 1st", "Mac OS");
		cb2 = new Chromebook("CB0012", "SAMSUNG Chromebook 4+", "Win 10");
		cb3 = new Chromebook("CB0013", "HUAWEI Magicbook 100+", "Mac 10");

		camcorderList = new ArrayList<Camcorder>();
		chromebookList = new ArrayList<Chromebook>();
	}

	@Test
	public void testAddCamcorder() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Camcorder arraylist to add to", camcorderList);
<<<<<<< HEAD
		assertEquals("Test that the Camcorder arraylist is empty.", 0, camcorderList.size());
		// Given an empty list, after adding 1 item, the size of the list is 1
		ResourceCentre.addCamcorder(camcorderList, cc1);
		assertEquals("Test that the Camcorder arraylist size is 1.", 1, camcorderList.size());
=======
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git

<<<<<<< HEAD
		// Add an item
=======
		// Given an empty list, after adding 1 item, the size of the list is 1
		ResourceCentre.addCamcorder(camcorderList, cc1);
		assertEquals("Test if that Camcorder arraylist size is 1?", 1, camcorderList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Camcorder is added same as 1st item of the list?", cc1, camcorderList.get(0));

		// Add another item. test The size of the list is 2?
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
		ResourceCentre.addCamcorder(camcorderList, cc2);
<<<<<<< HEAD
		assertEquals("Test that the Camcorder arraylist size is now 2.", 2, camcorderList.size());
		// The item just added is as same as the last item in the list
		assertSame("Test that Camcorder is added to the end of the list.", cc2, camcorderList.get(1));

		// Add an item that already exists in the list
		ResourceCentre.addCamcorder(camcorderList, cc2);
		assertEquals("Test that the Camcorder arraylist size is unchange.", 2, camcorderList.size());

		// Add an item that has missing detail
		Camcorder cc_missing = new Camcorder("CC0014", "", 60);
		ResourceCentre.addCamcorder(camcorderList, cc_missing);
		assertEquals("Test that the Camcorder arraylist size is unchange.", 2, camcorderList.size());
=======
		ResourceCentre.addCamcorder(camcorderList, cc3);
		assertEquals("Test that Camcorder arraylist size is 3?", 3, camcorderList.size());
		assertSame("Test that Camcorder is added same as 3rd item of the list?", cc3, camcorderList.get(2));
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
	}

	@Test
	public void testAddChromebook() {
		// fail("Not yet implemented");
		// write your code here
<<<<<<< HEAD
		// Item list is not null and it is empty
		assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);
		assertEquals("Test that the Chromebook arraylist is empty.", 0, chromebookList.size());
		// Given an empty list, after adding 1 item, the size of the list is 1
		ResourceCentre.addChromebook(chromebookList, cb1);
		assertEquals("Test that the Chromebook arraylist size is 1.", 1, chromebookList.size());

		// Add an item
		ResourceCentre.addChromebook(chromebookList, cb2);
		assertEquals("Test that the Chromebook arraylist size is now 2.", 2, chromebookList.size());
		// The item just added is as same as the last item in the list
		assertSame("Test that Chromebook is added to the end of the list.", cb2, chromebookList.get(1));

		// Add an item that already exists in the list
		ResourceCentre.addChromebook(chromebookList, cb2);
		assertEquals("Test that the Chromebook arraylist size is unchange.", 2, chromebookList.size());

		// Add an item that has missing detail
		Chromebook cb_missing = new Chromebook("CB0014", "", "Win 10");
		ResourceCentre.addChromebook(chromebookList, cb_missing);
		assertEquals("Test that the Chromebook arraylist size is unchange.", 2, chromebookList.size());
=======
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		ResourceCentre.addChromebook(chromebookList, cb1);
		assertEquals("Test if that Chromebook arraylist size is 1?", 1, chromebookList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Chromebook is added same as 1st item of the list?", cb1, chromebookList.get(0));

		// Add another item. test The size of the list is 2?
		ResourceCentre.addChromebook(chromebookList, cb2);
		ResourceCentre.addChromebook(chromebookList, cb3);
		assertEquals("Test that Chromebook arraylist size is 3?", 3, chromebookList.size());
		assertSame("Test that Chromebook is added same as 3rd item of the list?", cb3, chromebookList.get(2));
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
	}

	@Test
	public void testRetrieveAllCamcorder() {
<<<<<<< HEAD
		// Test Case 1
		// Test if Item list is not null and empty
=======
		// Test if Item list is not null but empty, so that can add a new item
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
		assertNotNull("Test if there is valid Camcorder arraylist to add to", camcorderList);
<<<<<<< HEAD
		assertEquals("Test that the Camcorder arraylist is empty.", 0, camcorderList.size());
		// Attempt to retrieve the Camcorders
		String allCamcorder = ResourceCentre.retrieveAllCamcorder(camcorderList);
		String testOutput = "";
		// Test if the output is empty
		assertEquals("Test that nothing is displayed", testOutput, allCamcorder);
=======
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git

<<<<<<< HEAD
		// Test Case 2
=======
		// test if the list of camcorders retrieved from the SourceCentre is empty
		String allCamcorder = ResourceCentre.retrieveAllCamcorder(camcorderList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allCamcorder);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
		ResourceCentre.addCamcorder(camcorderList, cc1);
		ResourceCentre.addCamcorder(camcorderList, cc2);
<<<<<<< HEAD
		// Test that the list is not empty
		assertEquals("Test that Camcorder arraylist size is 2.", 2, camcorderList.size());
		// Attempt to retrieve the Camcoders
		allCamcorder = ResourceCentre.retrieveAllCamcorder(camcorderList);
		testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n", "CC0011", "Nikon HDSLR", "Yes", "", 40);
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n", "CC0012", "Sony DSC-RX100M7", "Yes", "", 20);
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allCamcorder);
=======
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, camcorderList.size());
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git

<<<<<<< HEAD
		// Test Case 3
		cc3.setIsAvailable(false);
		ResourceCentre.addCamcorder(camcorderList, cc3);
		assertEquals("Test that Camcorder arraylist size is 2.", 3, camcorderList.size());
		assertFalse("Test that the last item in the arraylist is not available", camcorderList.get(2).getIsAvailable());
		// Attempt to retrieve the Camcorders
		allCamcorder = ResourceCentre.retrieveAllCamcorder(camcorderList);
		testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n", "CC0011", "Nikon HDSLR", "Yes", "", 40);
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n", "CC0012", "Sony DSC-RX100M7", "Yes", "", 20);
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allCamcorder);
=======
		// test if the expected output string same as the list of chromebooks retrieved
		// from the SourceCentre
		allCamcorder = ResourceCentre.retrieveAllCamcorder(camcorderList);

		testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n", "CC0011", "Nikon HDSLR", "Yes", "", 40);
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n", "CC0012", "Sony DSC-RX100M7", "Yes", "", 20);

		assertEquals("Check that ViewAllCamcorderlist", testOutput, allCamcorder);

>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
	}

	@Test
	public void testRetrieveAllChromebook() {
<<<<<<< HEAD
		// Test Case 1
		// Test if Item list is not null and empty
		assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);
		assertEquals("Test that the Chromebook arraylist is empty.", 0, chromebookList.size());
		// Attempt to retrieve the Chromebooks
		String allChromebook = ResourceCentre.retrieveAllChromebook(chromebookList);
		String testOutput = "";
		// Test if the output is empty
		assertEquals("Test that nothing is displayed", testOutput, allChromebook);

		// Test Case 2
		ResourceCentre.addChromebook(chromebookList, cb1);
		ResourceCentre.addChromebook(chromebookList, cb2);
		// Test that the list is not empty
		assertEquals("Test that Chromebook arraylist size is 2.", 2, chromebookList.size());
		// Attempt to retrieve the Chromebooks
		allChromebook = ResourceCentre.retrieveAllChromebook(chromebookList);
		testOutput = String.format("%-10s %-30s %-10s %-10s %-20s\n", "CB0011", "My Google Chromebook 1st", "Yes", "",
				"Mac OS");
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n", "CB0012", "SAMSUNG Chromebook 4+", "Yes", "",
				"Win 10");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allChromebook);

		// Test Case 3
		cb3.setIsAvailable(false);
		ResourceCentre.addChromebook(chromebookList, cb3);
		assertEquals("Test that Chromebook arraylist size is 2.", 3, chromebookList.size());
		assertFalse("Test that the last item in the arraylist is not available",
				chromebookList.get(2).getIsAvailable());
		// Attempt to retrieve the Chromebooks
		allChromebook = ResourceCentre.retrieveAllChromebook(chromebookList);
		testOutput = String.format("%-10s %-30s %-10s %-10s %-20s\n", "CB0011", "My Google Chromebook 1st", "Yes", "",
				"Mac OS");
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n", "CB0012", "SAMSUNG Chromebook 4+", "Yes", "",
				"Win 10");
		// Test that the details are displayed correctly
		assertEquals("Test that the display is correct.", testOutput, allChromebook);
=======
		// fail("Not yet implemented");
		// write your code here
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);

		// test if the list of chromebooks retrieved from the SourceCentre is empty
		String allChromebook = ResourceCentre.retrieveAllChromebook(chromebookList);
		String testOutput = "";
		assertEquals("Check that ViewAllChromebooklist", testOutput, allChromebook);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		ResourceCentre.addChromebook(chromebookList, cb1);
		ResourceCentre.addChromebook(chromebookList, cb2);
		assertEquals("Test if that Chromebook arraylist size is 2?", 2, chromebookList.size());

		// test if the expected output string same as the list of chromebooks retrieved
		// from the SourceCentre
		allChromebook = ResourceCentre.retrieveAllChromebook(chromebookList);

		testOutput = String.format("%-10s %-30s %-10s %-10s %-20s\n", "CB0011", "My Google Chromebook 1st", "Yes", "",
				"Mac OS");
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n", "CB0012", "SAMSUNG Chromebook 4+", "Yes", "",
				"Win 10");

		assertEquals("Check that ViewAllCamcorderlist", testOutput, allChromebook);
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
	}

	@Test
	public void testDoLoanCamcorder() {

		// boundary
		assertNotNull("test if there is valid Camcorder arraylist to loan from", camcorderList);

		ResourceCentre.addCamcorder(camcorderList, cc1);
<<<<<<< HEAD
=======

		// normal
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
		Boolean ok = ResourceCentre.doLoanCamcorder(camcorderList, "CC0011", "8-8-2020");
		assertTrue("Test if an available item is ok to loan?", ok);
		assertFalse(camcorderList.get(0).getIsAvailable());
		assertEquals(camcorderList.get(0).getDueDate(), "8-8-2020");

		// error condition
		ok = ResourceCentre.doLoanCamcorder(camcorderList, "CC0011", "8-8-2020");
		assertFalse("Test if an same item is NOT ok to loan again?", ok);

		// error condition
		ResourceCentre.addCamcorder(camcorderList, cc2);
<<<<<<< HEAD
		assertFalse("Test that there is an item not available", camcorderList.get(1).getIsAvailable());
		ok = ResourceCentre.doLoanCamcorder(camcorderList, "CC0012", "8-8-2020");
		assertFalse("Test that the loan fails.", ok);
=======
		cc2.setIsAvailable(false);
		ok = ResourceCentre.doLoanCamcorder(camcorderList, "CC0012", "8-8-2020");
		assertFalse("Test that un-available item is NOT ok to loan?", ok);
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git

<<<<<<< HEAD
		// Test Case 3 - Item not found
		ok = ResourceCentre.doLoanCamcorder(camcorderList, "CC0016", "8-8-2020");
		assertFalse("Test that the loan fails.", ok);
=======
		// error condition
		ok = ResourceCentre.doLoanCamcorder(camcorderList, "CC0013", "8-8-2020");
		assertFalse("Test that non-esiting item is NOT ok to loan?", ok);
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git

<<<<<<< HEAD
		// Test case 4 - Missing details
		ResourceCentre.addCamcorder(camcorderList, cc3);
		assertTrue("Test that there is an item available", camcorderList.get(2).getIsAvailable());
		ok = ResourceCentre.doLoanCamcorder(camcorderList, "CC0013", "");
		assertFalse("Test that the loan fails.", ok);
=======
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
	}

	@Test
	public void testDoLoanChromebook() {
		// fail("Not yet implemented");
		// write your code here
<<<<<<< HEAD
		assertNotNull("test if there is valid Chromebook arraylist to loan from", chromebookList);
		ResourceCentre.addChromebook(chromebookList, cb1);
		Boolean ok = ResourceCentre.doLoanChromebook(chromebookList, "CB0011", "8-8-2020");
		assertTrue("Test if an available item is ok to loan?", ok);
		assertFalse(chromebookList.get(0).getIsAvailable());
		assertEquals(chromebookList.get(0).getDueDate(), "8-8-2020");

		// Test Case 2 - Loan an unavailable item
		cb2.setIsAvailable(false);
		ResourceCentre.addChromebook(chromebookList, cb2);
		assertFalse("Test that there is an item not available", chromebookList.get(1).getIsAvailable());
		ok = ResourceCentre.doLoanChromebook(chromebookList, "CB0012", "8-8-2020");
		assertFalse("Test that the loan fails.", ok);

		// Test Case 3 - Item not found
		ok = ResourceCentre.doLoanChromebook(chromebookList, "CB0016", "8-8-2020");
		assertFalse("Test that the loan fails.", ok);

		// Test case 4 - Missing details
		ResourceCentre.addChromebook(chromebookList, cb3);
		assertTrue("Test that there is an item available", chromebookList.get(2).getIsAvailable());
		ok = ResourceCentre.doLoanChromebook(chromebookList, "CB0013", "");
		assertFalse("Test that the loan fails.", ok);
=======
		// boundary
		assertNotNull("test if there is valid Chromebook arraylist to loan from", chromebookList);

		ResourceCentre.addChromebook(chromebookList, cb1);

		// normal
		Boolean ok = ResourceCentre.doLoanChromebook(chromebookList, "CB0011", "8-8-2020");
		assertTrue("Test if an available item is ok to loan?", ok);
		assertFalse(chromebookList.get(0).getIsAvailable());
		assertEquals(chromebookList.get(0).getDueDate(), "8-8-2020");

		// error condition
		ok = ResourceCentre.doLoanChromebook(chromebookList, "CB0011", "8-8-2020");
		assertFalse("Test if an same item is NOT ok to loan again?", ok);

		// error condition
		ResourceCentre.addChromebook(chromebookList, cb2);
		cb2.setIsAvailable(false);
		ok = ResourceCentre.doLoanChromebook(chromebookList, "CB0012", "8-8-2020");
		assertFalse("Test that un-available item is NOT ok to loan?", ok);

		// error condition
		ok = ResourceCentre.doLoanChromebook(chromebookList, "CB0013", "8-8-2020");
		assertFalse("Test that non-existing item is NOT ok to loan?", ok);
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
	}

	@Test
	public void testDoReturnCamcorder() {
<<<<<<< HEAD

		// Test case 1: Return a loaned out item
=======
		// boundary
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
		assertNotNull("Test if there is valid Camcorder arraylist to add to", camcorderList);
		ResourceCentre.addCamcorder(camcorderList, cc1);
<<<<<<< HEAD
		Boolean ok = ResourceCentre.doLoanCamcorder(camcorderList, "CC0011", "8-8-2020");
		assertTrue("Test if CC0011 is successfully loaned out.", ok);
=======
		// error
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
		Boolean isReturned = ResourceCentre.doReturnCamcorder(camcorderList, "CC0011");
<<<<<<< HEAD
		assertTrue("Test if the return of CC0011 is successful.", isReturned);
		assertTrue("Test that CC0011 is now available.", camcorderList.get(0).getIsAvailable());

		// Test case 2: Return an item that is not loaned out
		isReturned = ResourceCentre.doReturnCamcorder(camcorderList, "CC0011");
		assertFalse("Test that the return fails.", isReturned);

		// Test case 3: Return an item that does not exist
=======
		assertFalse("Test if available camcorder CC0011 is returned -false?", isReturned);
		// normal
		ResourceCentre.addCamcorder(camcorderList, cc2);
		cc2.setIsAvailable(false);
		isReturned = ResourceCentre.doReturnCamcorder(camcorderList, "CC0012");
		assertTrue("Test if loaned out amcorder CC0012 is returned- true", isReturned);
		// error
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
		isReturned = ResourceCentre.doReturnCamcorder(camcorderList, "CC0013");
<<<<<<< HEAD
		assertFalse("Test the the return of CC0013 fails.", isReturned);
=======
		assertFalse("Test if non-existing amcorder CC0013 is returned - false?", isReturned);

>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
	}

	@Test
	public void testDoReturnChromebook() {
		// fail("Not yet implemented");
		// write your code here
<<<<<<< HEAD
		assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);
		ResourceCentre.addChromebook(chromebookList, cb1);
		Boolean ok = ResourceCentre.doLoanChromebook(chromebookList, "CB0011", "8-8-2020");
		assertTrue("Test if CB0011 is successfully loaned out.", ok);
		Boolean isReturned = ResourceCentre.doReturnChromebook(chromebookList, "CB0011");
		assertTrue("Test if the return of CB0011 is successful.", isReturned);
		assertTrue("Test that CB0011 is now available.", chromebookList.get(0).getIsAvailable());

		// Test case 2: Return an item that is not loaned out
		isReturned = ResourceCentre.doReturnChromebook(chromebookList, "CB0011");
		assertFalse("Test that the return fails.", isReturned);

		// Test case 3: Return an item that does not exist
		isReturned = ResourceCentre.doReturnChromebook(chromebookList, "CB0013");
		assertFalse("Test the the return of CB0013 fails.", isReturned);
=======
		// boundary
		assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);
		ResourceCentre.addChromebook(chromebookList, cb1);
		// error
		Boolean isReturned = ResourceCentre.doReturnChromebook(chromebookList, "CB0011");
		assertFalse("Test if available chromebook CB0011 is returned -false?", isReturned);
		// normal
		ResourceCentre.addChromebook(chromebookList, cb2);
		cb2.setIsAvailable(false);
		isReturned = ResourceCentre.doReturnChromebook(chromebookList, "CB0012");
		assertTrue("Test if loaned out chromebook CB0012 is returned- true", isReturned);
		// error
		isReturned = ResourceCentre.doReturnChromebook(chromebookList, "CB0013");
		assertFalse("Test if non-existing chromebook CB0013 is returned - false?", isReturned);
>>>>>>> branch 'master' of https://github.com/20033909/ResourceCentre_Student.git
	}

	@After
	public void tearDown() throws Exception {
		cc1 = null;
		cc2 = null;
		cb1 = null;
		cb2 = null;
		camcorderList = null;
		chromebookList = null;

	}

}