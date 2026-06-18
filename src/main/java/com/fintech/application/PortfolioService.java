package com.fintech.application;

import com.fintech.domain.Portfolio;
import com.fintech.infrastructure.PortfolioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PortfolioService {
    private final PortfolioRepository repository;

    public PortfolioService(PortfolioRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Portfolio createPortfolio(String name) {
        Portfolio portfolio = new Portfolio(null, name);
        return repository.save(portfolio);
    }

    public List<Portfolio> getAllPortfolios() {
        return repository.findAll();
    }
}