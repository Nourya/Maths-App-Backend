package com.example.MathsBackend.controller;

import com.example.MathsBackend.model.EquationRequest;
import com.example.MathsBackend.model.EquationResponse;
import com.example.MathsBackend.service.EquationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/equation")
public class EquationController {
    private final EquationService equationService;
    public EquationController (EquationService equationService){
        this.equationService = equationService;
    }

    @PostMapping("/solve")
    public EquationResponse solve(@RequestBody EquationRequest req) {
        return equationService.solveEquation(req);
    }
}
