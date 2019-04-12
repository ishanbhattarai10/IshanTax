package com.ishantax;

public class TaxCalculator{
    private double income, tax;

    public TaxCalculator(double income) {
        this.income = income;
    }

    public double Tax(){
        income= income*12;

        if (income>1 && income<200000){
            tax = income * 1/100;

        }
        else if (income>200000 && income <350000) {
            tax = (200000 * 1/100) +(income-200000)*15/100;
        }
        else if (income>350000) {
            tax = 200000 * 1/100 +150000*15/100+ (income - 350000)*25/100;
        }
        return tax;
    }
}