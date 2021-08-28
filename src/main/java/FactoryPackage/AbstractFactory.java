/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPackage;
import FactoryPackage.HeroeFactory;
import FactoryPackage.VillanoFactory;
import Principal.Heroe;
import Principal.Villano;

public interface AbstractFactory {   
    public Heroe getHeroe();
    public Villano getVillano();
}
