package com.example.Fraud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fraud")
public class FraudController {

    @Autowired
    private FraudService fraudService;

    @GetMapping("/check/{cardNumber}")
    public boolean checkCard(@PathVariable String cardNumber) {
        return fraudService.isCardBlacklisted(cardNumber);
    }
}
