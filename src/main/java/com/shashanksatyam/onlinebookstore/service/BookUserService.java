package com.shashanksatyam.onlinebookstore.service;

import java.util.Set;

import com.shashanksatyam.onlinebookstore.entity.Book;
import com.shashanksatyam.onlinebookstore.entity.Customer;

public interface BookUserService {

	Set<Book> getBooksPurchasedBy(Customer customer);

}
