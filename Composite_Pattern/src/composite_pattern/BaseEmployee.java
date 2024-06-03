/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_pattern;

/**
 *
 * @author SP21-BSE-017
 */
public abstract class BaseEmployee implements IEmployee {
    private String name;
    private double salary;

    /**
     *
     * @param name
     * @param salary
     */
    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        salary += salary * bonusPercentage / 100.0;
    }
}
