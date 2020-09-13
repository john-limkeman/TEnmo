package com.techelevator.tenmo.dao;

import java.math.BigDecimal;
import java.util.List;

import com.techelevator.tenmo.model.Transfer;

public interface TransferDAO {

		public List<Transfer> transferHistory(int accountId);
		
		public Transfer viewTransfer(int transferId);
		
		public void rejectTransfer(Transfer transfer);

		public Transfer createTransfer(int type, int status, int from, int to, double amount);
		
		public List<Transfer> pendingTransfers(int accountId);
		
		public Transfer requestTransfer(int from, int to, double amount);
		
		
}
