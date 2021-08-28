/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPackage;
import Principal.Villano;
import Principal.Marvel;
import Principal.DC;

public class VillanoFactory implements AbstractFactory{
    public Villano getVillano() {
        return new Villano ("Marvel","Thor");
    }
}
