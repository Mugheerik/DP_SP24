/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author sp21-bse-017
 */
public class Rectangle implements Shape {
  protected  double price = 1.22;
   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
     
   }
   @Override
   public double getPrice(){
       return price;
   }
}
