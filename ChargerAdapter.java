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
public class ChargerAdapter implements SamsungCharger{
    NokiaCharger charger;
    
    public ChargerAdapter(NokiaCharger charger){
        this.charger = charger;
    }

    @Override
    public void chargeSamsungPlug() {
        charger.chargeNokiaPlug();
    }
    
}
