/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.abstract_factory.americanFood;

import creational_patterns.abstract_factory.VegeHamburger;

/**
 *
 * @author vadimzubchenko
 */
public class AmericanVegeHamburger implements VegeHamburger {

    public void makeHamburger() {
        System.out.println("American Vege hamburger is done!");
    }

    public String toString() {
        return "Here is American Vege Hamburger!";
    }
}
