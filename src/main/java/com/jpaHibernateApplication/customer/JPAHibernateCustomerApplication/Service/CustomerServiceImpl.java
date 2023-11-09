package com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Service;

import com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Model.Customer;
import com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Repository.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    public CustomerRepository customerRepository;


    public Customer addCustomer(Customer obj){
       return customerRepository.save(obj);
    }

    public Customer getCustomerByID(Long id){
        return customerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Customer with ID " + id + " don't exist in database"));
    }

    public boolean deleteCustomer(Long id){
        customerRepository.deleteById(id);
        return true;
    }

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

}
