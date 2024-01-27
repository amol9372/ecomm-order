package org.ecomm.ecommorder.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stripe")
public class StripeController {

    @PostMapping
    public void callback(){

    }

}
