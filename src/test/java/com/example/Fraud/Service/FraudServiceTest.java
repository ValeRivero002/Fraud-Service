package com.example.Fraud.Service;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FraudServiceTest {

    @Test
    void testIsCardBlacklisted() {
        FraudService fraudService = new FraudService();

        assertTrue(fraudService.isCardBlacklisted("1234567890123456")); // Tarjeta en la lista negra
        assertFalse(fraudService.isCardBlacklisted("5555666677778888")); // Tarjeta no en la lista negra
    }
}
