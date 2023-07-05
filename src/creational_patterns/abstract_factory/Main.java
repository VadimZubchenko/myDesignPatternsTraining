/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.abstract_factory;

import creational_patterns.abstract_factory.italianFood.ItalianFoodFactory;
import creational_patterns.abstract_factory.americanFood.AmericanFoodFactory;

/**
 *
 * @author vadimzubchenko
 */
public class Main {

    public static void main(String[] args) {

// Below is presented two differents products implementation
// first one using a method makeHamburger() and second toString() 
        HamburgerCreatingFactory italian = new ItalianFoodFactory();
        BeefHamburger beefhamburger = italian.getBeefHamburger();
        VegeHamburger vegeHamburger = italian.getVegeHamburger();
        System.out.println("Creating Italian hamburgers...");

        vegeHamburger.makeHamburger();
        beefhamburger.makeHamburger();

        System.out.println("\nOrdered American hamburgers...");

        HamburgerCreatingFactory american = new AmericanFoodFactory();

        System.out.println("Implemented using method toString() in product creating class.");
        //beef hamburger is ordered
        american.getBeefHamburger();

        american.completeOrder();
        //vege hamburger is ordered
        american.getVegeHamburger();
        american.completeOrder();
    }
}
