/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SP21-BSE-017
 */
public class HOD extends BaseEmployee implements CompositeEmployee {
    private List<IEmployee> subordinates;
    private String departmentName;

    public HOD(String name, double salary, String departmentName) {
        super(name, salary);
        subordinates = new ArrayList<>();
        this.departmentName = departmentName;
    }

    public void addSubordinate(IEmployee employee) {
        subordinates.add(employee);
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        super.giveBonus(bonusPercentage);
        for (IEmployee employee : subordinates) {
            employee.giveBonus(bonusPercentage);
        }
    }

    @Override
    public List<IEmployee> getSubordinates() {
        return subordinates; //To change body of generated methods, choose Tools | Templates.
    }
}
