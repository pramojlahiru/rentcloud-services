/**
 * ============================
 * Author - Pramoj Kumararathna
 * On     - 2020-05-30
 * At     - 02:51
 * ============================
 */

package com.pramoj.rentcloud.profileservice.service;

import com.pramoj.rentcloud.commons.model.Customer;
import com.pramoj.rentcloud.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
