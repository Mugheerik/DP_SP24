/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment2;

/**
 *
 * @author sp21-bse-017
 */
public class proxyFlightTicket implements FlightTicket {
     private realFlightTicket realFlightTicket;
     private String destination;
     
     public proxyFlightTicket(String destination){
         this.destination = destination;

         }
    
    @Override
    public void requestTicket() {
        try{
        if (realFlightTicket == null){
             realFlightTicket = new realFlightTicket(destination);
         }
         realFlightTicket.requestTicket(); //To change body of generated methods, choose Tools | Templates.
    }
    
    catch (Exception e){
            System.out.println("Your ticket is at departure desk");
        }
}
    
}
