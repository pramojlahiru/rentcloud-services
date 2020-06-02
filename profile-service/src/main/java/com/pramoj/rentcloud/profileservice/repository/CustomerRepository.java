/**
 * ============================
 * Author - Pramoj Kumararathna
 * On     - 2020-05-30
 * At     - 02:44
 * ============================
 */

package com.pramoj.rentcloud.profileservice.repository;

import com.pramoj.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
