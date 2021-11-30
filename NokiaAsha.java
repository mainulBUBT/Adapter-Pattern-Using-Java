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
public class NokiaAsha implements NokiaCharger {

    @Override
    public void chargeNokiaPlug() {
        System.out.println("Nokia Asha Charging...");
    }
    
}
