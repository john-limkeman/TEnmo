package com.techelevator.tenmo.dao;

import java.math.BigDecimal;

import com.techelevator.tenmo.model.Transfer;

public interface AccountDAO {

		public double viewBalance(int id);
		// shows remaining balance of account by id
		
		public void transferFunds(Transfer transfer);
		// subtracts transfer amount from one balance and
		// adds it to the other balance
		
}
