package com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Service;


import com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Model.Customer;

import java.util.List;

public interface CustomerService {

    public Customer addCustomer(Customer obj);

    public boolean deleteCustomer(Long id);

    public List<Customer> getAllCustomer();

    public Customer getCustomerByID(Long id);



}
