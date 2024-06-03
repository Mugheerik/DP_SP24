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
public class Composite_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         IEmployee director = EmployeeController.generateOrganogram();
         EmployeeController.printOrganogram(director,"");
        // Print the employee structure (optional)
        EmployeeController.activateBonus("Performance", 10, director);
        
    }
    
}

