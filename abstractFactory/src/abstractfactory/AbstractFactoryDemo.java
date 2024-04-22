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
public class AbstractFactoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("DOUBLEROUNDED");
      //get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shape shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
      //call draw method of Triangle Square
      Shape shape3 = shapeFactory.getShape("Triangle");
      //call draw method of Shape Square
      shape3.draw();
      //get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory("ROUNDED");
      //get an object of Shape Rectangle
      Shape shape4 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape4.draw();
      //get an object of Shape Square 
      Shape shape5 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape5.draw();
      //get an object of Triangle Square
      Shape shape6 = shapeFactory1.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape6.draw();
      AbstractFactory shapeFactory2 = FactoryProducer.getFactory("");
      //get an object of Shape Rectangle
      Shape shape7 = shapeFactory2.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape7.draw();
      //get an object of Shape Square 
      Shape shape8 = shapeFactory2.getShape("SQUARE");
      //call draw method of Shape Square
      shape8.draw();
      //get an object of Triangle Square
      Shape shape9 = shapeFactory2.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape9.draw();
// TODO code application logic here
    }
    
}
