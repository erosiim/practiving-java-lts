package org.eros.java_practicing.java8.functionalInterface;

public class SalaryCalculator {

    public double calculateIncome(double salary, double taxesPercent, double bonus, ICalculateSalary iCalculateSalary){
        return iCalculateSalary.calculateIncome(salary, taxesPercent, bonus);
    }

}
