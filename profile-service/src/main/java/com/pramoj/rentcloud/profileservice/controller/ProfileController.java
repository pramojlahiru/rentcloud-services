/**
 * ============================
 * Author - Pramoj Kumararathna
 * On     - 2020-05-30
 * At     - 02:39
 * ============================
 */

package com.pramoj.rentcloud.profileservice.controller;

import com.pramoj.rentcloud.commons.model.Customer;
import com.pramoj.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

}
