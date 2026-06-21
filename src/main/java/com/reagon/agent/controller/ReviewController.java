package com.reagon.agent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.reagon.agent.model.CodeReviewRequest;
import com.reagon.agent.model.Violation;
import com.reagon.agent.service.CodeReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private CodeReviewService codeReviewService;

    @PostMapping
    public List<Violation> review(
            @RequestBody CodeReviewRequest request) {

        return codeReviewService.analyze(
                request.getCode());
    }
}