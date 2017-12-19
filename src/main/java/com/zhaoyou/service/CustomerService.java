package com.zhaoyou.service;

import com.zhaoyou.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhaoyou on 19/12/2017.
 */
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Transactional(readOnly = true)
    public List<String> getString() {
        return customerRepository.getList();
    }
}
