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

public class Teacher extends BaseEmployee {
    private String qualification;
    private String status;

    public Teacher(String name, double salary, String qualification, String status) {
        super(name, salary);
        this.qualification = qualification;
        this.status = status;
    }
}
