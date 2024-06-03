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
public class EmployeeController {
    public static IEmployee generateOrganogram() {
        // Create employees
        Teacher teacher1 = new Teacher("Asim", 50000, "Masters", "Full Time");
        Teacher teacher2 = new Teacher("Kashif", 45000, "Bachelors", "Part Time");
        DOO doo = new DOO("Faisal", 60000, "Senior");
        HOD hod = new HOD("Abdullah", 70000, "Computer Science");
        Director director = new Director("Mugheer", 80000);

        // Build hierarchy
        hod.addSubordinate(teacher1);
        hod.addSubordinate(teacher2);
        hod.addSubordinate(doo);
        director.addSubordinate(hod);

        return director; // Return the root of the hierarchy (Director)
    }

    public static void activateBonus(String bonusType, int percentageOfBonus, IEmployee employee) {
        System.out.println("Activating " + bonusType + " bonus of " + percentageOfBonus + "% for " + employee.getName());
        employee.giveBonus(percentageOfBonus);

        // Recursively activate bonus for subordinates (if composite)
        if (employee instanceof HOD || employee instanceof Director) {
            for (IEmployee subordinate : ((CompositeEmployee) employee).getSubordinates()) {
                activateBonus(bonusType, percentageOfBonus, subordinate);
            }
        }
    }
   public static void printOrganogram(IEmployee employee, String indent) {
        System.out.println(indent + employee.getName() + " (" + employee.getClass().getSimpleName() + ")");
        if (employee instanceof CompositeEmployee) {
            for (IEmployee subordinate : ((CompositeEmployee) employee).getSubordinates()) {
                printOrganogram(subordinate, indent + "  ");
            }
        }
    }
}
