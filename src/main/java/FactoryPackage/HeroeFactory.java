/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPackage;

import Principal.Heroe;
import Principal.Marvel;
import Principal.DC;
import Principal.Villano;

public class HeroeFactory implements AbstractFactory{
    public Heroe getHeroe (){
        return new Heroe ("Marvel","Thor");    }

    @Override
    public Villano getVillano() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
}
