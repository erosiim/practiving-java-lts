package org.eros.java_practicing.java8.functionalInterface;

public class CalculateSalaryFactory {

    static ICalculateSalary SALARY_BONUS_2 = (salary, taxesPercent, bonus) -> {
        double v = salary + (bonus * 2);
        double v1 = v * taxesPercent;
        return v - v1;
    };

    static ICalculateSalary SALARY_BONUS_1 = (salary, taxesPercent, bonus) -> {
        double v = salary + bonus;
        double v1 = v * taxesPercent;
        return v - v1;
    };


    public static ICalculateSalary getTypeCalculateSalary(String typeOfCalculator){
        switch (typeOfCalculator){
            case "bonus1":
                return SALARY_BONUS_1;
            case "bonus2":
                return SALARY_BONUS_2;
            default:
                 throw new RuntimeException("The type of salary calculator is not defined yet");
        }
    }



}
