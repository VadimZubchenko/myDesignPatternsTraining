/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.abstract_factory;

/**
 *
 * @author vadimzubchenko
 */
public class Main {

    public static void main(String[] args) {
        HamburgerCreatingFactory italian = new ItalianFoodFactory();
        italian.createBeefHamburger();
        italian.completeOrder();
        italian.createVegeHamburger();
        italian.completeOrder();
        
        System.out.println("\n");
        
        HamburgerCreatingFactory american = new AmericanFoodFactory();
        american.createBeefHamburger();
        american.completeOrder();
        american.createVegeHamburger();
        american.completeOrder();
    }
}
