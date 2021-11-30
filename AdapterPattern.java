/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author MIHAN
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NokiaAsha ashaphone = new NokiaAsha();
        System.out.println("Nokia Charger Connected: ");
        ashaphone.chargeNokiaPlug();
        System.out.println();
        
        System.out.println("Samsung Charger Connected with S3: ");
        SamsungCharger charger = new SamsungS3();
        charger.chargeSamsungPlug();
        System.out.println();
        
        System.out.println("Nokia Charger Connected via adapter: ");
        SamsungCharger adapter = new ChargerAdapter(ashaphone);
        adapter.chargeSamsungPlug();
    }
    
}
