package com.example.microservice.forex;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcahngeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}