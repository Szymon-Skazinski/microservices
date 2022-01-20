package com.skazinski.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public RegisterCustomerResponse registerCustomer(@RequestBody CustomerRegistrationRequest customerRequest) {
        log.info("new customer registration {}", customerRequest);
        customerService.registerCustomer(customerRequest);
        return new RegisterCustomerResponse(String.format("Customer %s was created!!", customerRequest.getFirstName()));
    }
}
