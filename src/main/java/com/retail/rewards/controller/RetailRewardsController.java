package com.retail.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.rewards.entity.Customer;
import com.retail.rewards.model.RetailRewards;
import com.retail.rewards.repository.CustomerRepository;
import com.retail.rewards.service.RetailRewardsService;


@RestController
@RequestMapping("/customers")
public class RetailRewardsController {

    @Autowired
    RetailRewardsService rewardsService;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/{customerId}/rewards",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RetailRewards> getRewardsByCustomerId(@PathVariable("customerId") Long customerId){
        Customer customer = customerRepository.findByCustomerId(customerId);
        if(customer == null)
        {
        	throw new RuntimeException("Invalid / Missing customer Id ");
        }
        RetailRewards customerRewards = rewardsService.getRewardsByCustomerId(customerId);
        return new ResponseEntity<>(customerRewards,HttpStatus.OK);
    }

}
