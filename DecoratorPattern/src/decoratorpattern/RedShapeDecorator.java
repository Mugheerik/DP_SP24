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
public class RedShapeDecorator extends ShapeDecorator {
   double price = 2.33;
   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();
      
      setRedBorder(decoratedShape);
      System.out.println("Price:" +computeCost(decoratedShape));
      
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
   private double computeCost(Shape decoratedShape){
       return decoratedShape.getPrice()+getPrice();
   }

    @Override
    public double getPrice() {
        return price;//To change body of generated methods, choose Tools | Templates.
    }
   
}
