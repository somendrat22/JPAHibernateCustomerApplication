package com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Repository;

import com.jpaHibernateApplication.customer.JPAHibernateCustomerApplication.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
