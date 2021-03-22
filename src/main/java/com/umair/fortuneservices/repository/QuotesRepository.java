package com.umair.fortuneservices.repository;

import com.umair.fortuneservices.model.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quotes, Long> {
}
