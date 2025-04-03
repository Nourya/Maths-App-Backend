package com.example.MathsBackend.controller;

import com.example.MathsBackend.model.EquationRequest;
import com.example.MathsBackend.model.EquationResponse;
import com.example.MathsBackend.service.EquationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/equation")
@CrossOrigin(origins = "http://localhost:4200")
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
