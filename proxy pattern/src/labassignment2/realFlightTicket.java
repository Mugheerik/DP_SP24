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
public class realFlightTicket implements FlightTicket {
    private String destination;
    
    public realFlightTicket(String destination)
    {
       this.destination = destination;
       loadFromDatabase(destination);
    }
    
    private void loadFromDatabase(String destination)
    {
        System.out.println("fetching ticket details for :"+ destination);
        try{
            Thread.sleep(3000);
            
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void requestTicket() {
        System.out.println("your ticket for : "+ destination);//To change body of generated methods, choose Tools | Templates.
    }
    
}
