/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPackage;

import Principal.Heroe;
import Principal.Villano;

public class VillanoFactory implements AbstractFactory{
    public Villano getVillano() {
       return new Villano ("Marvel","Thor");
    } 

    @Override
    public Heroe getHeroe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
