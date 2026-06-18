package com.fintech.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PortfolioTest {
    @Test
    public void testPortfolioCreation() {
        Portfolio portfolio = new Portfolio(1L, "Test Portfolio");
        Assertions.assertEquals("Test Portfolio", portfolio.name());
    }
}