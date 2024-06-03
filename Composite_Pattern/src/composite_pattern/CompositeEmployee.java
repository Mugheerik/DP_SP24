/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_pattern;

import java.util.List;

/**
 *
 * @author SP21-BSE-017
 */
interface CompositeEmployee {
    List<IEmployee> getSubordinates();
}
