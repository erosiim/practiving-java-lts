package org.eros.java_practicing.java8.functionalInterface;

public class MainSalaryCalculator {
    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator();

        System.out.println(sc.calculateIncome(23000, .16, 100, CalculateSalaryFactory.getTypeCalculateSalary("bonus1")));

        System.out.println(sc.calculateIncome(23000, .16, 200, CalculateSalaryFactory.getTypeCalculateSalary("bonus2")));

    }
}
