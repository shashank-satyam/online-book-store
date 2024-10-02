package com.shashanksatyam.onlinebookstore.service;

import java.util.Set;

import com.shashanksatyam.onlinebookstore.entity.Customer;
import com.shashanksatyam.onlinebookstore.entity.PurchaseDetail;
import com.shashanksatyam.onlinebookstore.entity.PurchaseHistory;

public interface PaymentService {

	String createTransaction(Customer customer);
	
	Set<PurchaseHistory> getPurchaseHistories(Customer customer);
	
	Set<PurchaseDetail> getPurchaseDetails(PurchaseHistory purchaseHistory);

	PurchaseHistory getPurchaseHistory(Customer customer, String transId);
}
