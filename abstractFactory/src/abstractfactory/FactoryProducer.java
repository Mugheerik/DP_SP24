/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author SP21-BSE-017
 */
public class FactoryProducer {
   public static AbstractFactory getFactory(String Type){   
      if(Type.equalsIgnoreCase("ROUNDED")){
         return new RoundedShapeFactory();         
      }else if (Type.equalsIgnoreCase("DOUBLEROUNDED")){
         return new DoubleRoundedShapeFactory();
      }else {
          return new ShapeFactory();
      }
   }
}
