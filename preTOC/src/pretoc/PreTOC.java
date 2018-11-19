/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pretoc;

/**
 *
 * @author Desiree
 */
public class PreTOC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wizard bob = new Wizard("bob", 300, 4, false, "Zap");
        //System.out.println(bob.getEntryFee());
        
        Wizard Greg = new Wizard("Greg", 300, 1, false, "shoot");
        System.out.println(Greg.getEntryFee());
        System.out.println(Greg.toString());
        System.out.println(bob.toString());
    }
    
}
