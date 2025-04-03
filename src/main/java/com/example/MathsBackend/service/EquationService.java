package com.example.MathsBackend.service;

import com.example.MathsBackend.model.EquationRequest;
import com.example.MathsBackend.model.EquationResponse;
import org.springframework.stereotype.Service;
@Service
public class EquationService {
    public EquationResponse solveEquation(EquationRequest req) {
        double a = req.getA();
        double b = req.getB();
        double c = req.getC();

        // Vérification si a == 0 (ce n'est plus une équation du second degré)
        if (a == 0) {
            if (b == 0) {
                return new EquationResponse("Pas de solution (a et b sont 0)");
            }
            double x = -c / b;
            return new EquationResponse("Équation de premier degré : x = " + x);
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            return new EquationResponse("Pas de solution réelle");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new EquationResponse("x = " + x);
        } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            return new EquationResponse("x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
