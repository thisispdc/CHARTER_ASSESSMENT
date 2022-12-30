package com.retail.rewards.controller;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.retail.rewards.repository.CustomerRepository;


@RunWith(SpringRunner.class)
@SpringBootTest(
  webEnvironment = SpringBootTest.WebEnvironment.MOCK,
  classes = RetailRewardsControllerTest.class)
@AutoConfigureMockMvc
@TestPropertySource(
  locations = "classpath:application-integrationtest.properties")
public class RetailRewardsControllerTest {
	
	@Autowired
    private MockMvc mvc;

    @Autowired
    private CustomerRepository repository;

	@Test
	public void testCustomer() throws Exception {	
		assertFalse(repository.existsById((long) 202));
		assertTrue(repository.existsById((long) 1001));
		}
	}


