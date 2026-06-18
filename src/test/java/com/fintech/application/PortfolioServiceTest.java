package com.fintech.application;

import com.fintech.domain.Portfolio;
import com.fintech.infrastructure.PortfolioRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PortfolioServiceTest {
    @Mock
    private PortfolioRepository repository;

    @InjectMocks
    private PortfolioService service;

    @Test
    public void testCreatePortfolio() {
        Mockito.when(repository.save(Mockito.any(Portfolio.class))).thenReturn(new Portfolio(1L, "Test Portfolio"));
        Portfolio portfolio = service.createPortfolio("Test Portfolio");
        Assertions.assertEquals("Test Portfolio", portfolio.name());
    }

    @Test
    public void testGetAllPortfolios() {
        Mockito.when(repository.findAll()).thenReturn(List.of(new Portfolio(1L, "Test Portfolio")));
        List<Portfolio> portfolios = service.getAllPortfolios();
        Assertions.assertEquals(1, portfolios.size());
        Assertions.assertEquals("Test Portfolio", portfolios.get(0).name());
    }
}