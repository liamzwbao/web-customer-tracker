package edu.neu.customertracker.service;

import edu.neu.customertracker.entity.Customer;
import java.util.List;

public interface CustomerService {

  List<Customer> getCustomers();
}