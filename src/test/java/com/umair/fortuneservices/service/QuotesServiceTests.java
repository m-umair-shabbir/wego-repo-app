package com.umair.fortuneservices.service;

import com.umair.fortuneservices.model.Quotes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class QuotesServiceTests {
	@Autowired
	QuotesService quotesService;

	@Test
	void testFindById() {
		Long id = 1L;
		Quotes object = quotesService.findById(id);
		Assertions.assertEquals(1L, object.getId());
	}
}
