package com.payments.easypayments.risk.paymentsriskservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.payments.easypayments.risk.paymentsrisk")
public class PaymentsRiskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentsRiskServiceApplication.class, args);
	}

}
