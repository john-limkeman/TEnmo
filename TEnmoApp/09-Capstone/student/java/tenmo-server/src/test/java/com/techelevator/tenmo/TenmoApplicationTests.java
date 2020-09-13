package com.techelevator.tenmo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.User;




@SpringBootTest
class TenmoApplicationTests {

    @Test
    void contextLoads() {
    }
    
    @Test
    public void TransferTest1() {
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
    @Test
    public void TransferTest2() {
    	Transfer transfer = new Transfer(1, 1, 1, 1, 2, 213);
		
		transfer.setId(89);
		transfer.setAccountFrom(2);
		transfer.setAccountTo(1);
		transfer.setAmount(34.08);
		transfer.setStatusId(2);
		transfer.setTypeId(2);
	
		assertEquals(89, transfer.getId());
		assertEquals(2, transfer.getAccountFrom());
		assertEquals(1, transfer.getAccountTo());
		assertEquals(2, transfer.getStatusId());
		assertEquals(2, transfer.getTypeId());
		
		double actual = transfer.getAmount();
		
		assertEquals(34.08, actual);

    }

}
