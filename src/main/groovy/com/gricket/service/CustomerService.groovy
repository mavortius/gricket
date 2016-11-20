package com.gricket.service

import com.gricket.domain.Customer
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CustomerService {

    Customer get(int id) {
        Customer.get(id)
    }
}
