package com.techelevator.tenmo;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techelevator.tenmo.models.Transfer;
import com.techelevator.tenmo.models.User;


public class TransferClientTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void toStringTest() {
		User user = new User();
		user.setId(1);
		user.setUsername("Jeff");
		Transfer transfer = new Transfer(2, 1, 2, 1, 2, 90.87);
		String actual = transfer.toString(user);
		String expected = 2 + "\t" + "From: " + "Jeff" + "\t$" + 90.87;
		
		assertEquals(expected, actual);
		
		transfer.setId(89);
		transfer.setAccountFrom(2);
		transfer.setAccountTo(1);
		transfer.setAmount(34.08);
		transfer.setStatusId(1);
		transfer.setTypeId(2);
		
		String actual2 = transfer.toString(user);
		String expected2 = 89 + "\t" + "To: " + "Jeff" + "\t$" + 34.08;
		assertEquals(expected2, actual2);
		
		transfer.setAccountFrom(2);
		transfer.setAccountTo(3);
		
		String actual3 = transfer.toString(user);
		String expected3 = "invalid transaction";
		assertEquals(expected3, actual3);
	}
	
	@Test
	public void TransferGettersTest() {
		Transfer transfer = new Transfer();
		Transfer transfer2 = new Transfer(1, 1, 1, 2, 12);
		
		transfer2.setId(5);
		int actual = transfer2.getId();
		int expected = 5;
		assertEquals(expected, actual);
		
		int actual2 = transfer2.getTypeId();
		int expected2 = 1;
		assertEquals(expected2, actual2);
		
		assertEquals(1, transfer2.getStatusId());
		
		int actual3 = (int) transfer2.getAmount();
		int expected3 = 12;
		
		assertEquals(expected3, actual3);
	}

}
