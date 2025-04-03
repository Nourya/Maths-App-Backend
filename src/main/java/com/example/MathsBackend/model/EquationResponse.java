package com.example.MathsBackend.model;

public class EquationResponse {
    private String solution;
    public EquationResponse (String solution){
        this.solution=solution;
    }
    public String getSolution(){ return solution;}
}
