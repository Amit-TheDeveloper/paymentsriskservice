package com.payments.easypayments.risk.paymentsrisk.controllers;


import com.payments.easypayments.risk.paymentsrisk.model.RiskScore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiskAnalyzerController {

    @GetMapping("/riskScore/{phoneNos}")
    public RiskScore retrieveRiskScore(@PathVariable String phoneNos) {

        RiskScore riskScore = new RiskScore();
        riskScore.setRiskScore("5");
        return riskScore;
    }

}
