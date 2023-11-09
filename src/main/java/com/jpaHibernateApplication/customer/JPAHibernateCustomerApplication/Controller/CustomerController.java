package com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Controller;

import com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Model.Customer;
import com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Service.CustomerService;
import com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/allcustomers")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }


    @PostMapping("/addcustomer")
    public Customer addCustomerInDB(@RequestBody Customer obj){
        return customerService.addCustomer(obj);
    }

}
