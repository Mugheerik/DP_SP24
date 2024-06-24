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
public class LabAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FlightTicket ticket1  = new proxyFlightTicket("Hunza");
        System.out.println("proxy created");
        ticket1.requestTicket();
    }
    
}
