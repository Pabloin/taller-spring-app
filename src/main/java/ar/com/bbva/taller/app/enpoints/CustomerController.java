package ar.com.bbva.taller.app.enpoints;


import ar.com.bbva.taller.app.model.Customer;
import ar.com.bbva.taller.app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @RequestMapping(value="/{named}", method= RequestMethod.GET)
    public List<Customer> byName(@PathVariable String name) {
        return customerRepository.findByName(name);

    }


}


