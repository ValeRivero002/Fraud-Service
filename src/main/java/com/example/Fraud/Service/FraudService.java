package com.example.Fraud.Service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FraudService {
    // Lista negra de tarjetas
    private final List<String> blacklistedCards = Arrays.asList("1234567890123456", "9876543210987654", "1111222233334444");

    public boolean isCardBlacklisted(String cardNumber) {
        return blacklistedCards.contains(cardNumber);
    }
}
