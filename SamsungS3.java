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
public class SamsungS3 implements SamsungCharger {

    @Override
    public void chargeSamsungPlug() {
        System.out.println("Samsung S3 Charging...");
    }
    
}
