package com.reagon.agent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.reagon.agent.model.Violation;

@Service
public class CodeReviewService {

    public List<Violation> analyze(String code) {
        List<Violation> violations = new ArrayList<>();

        if(code.contains("catch(Exception") || code.contains("catch (Exception)")) {
            violations.add(
                new Violation(
                    "EXCEPTION_RULE",
                    "HIGH",
                    "Avoid generic exception handling"
                )
            );
        }

        return violations;
    }
}