package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoliceTest {
    @Test
    void should_check_driver_age() {
        assertTrue(new Police().checkDriverAdult(new Driver(18)));
        assertFalse(new Police().checkDriverAdult(new Driver(17)));
    }
}
