/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.abstract_factory.americanFood;

import creational_patterns.abstract_factory.americanFood.AmericanBeefHamburger;
import creational_patterns.abstract_factory.americanFood.AmericanVegeHamburger;
import creational_patterns.abstract_factory.BeefHamburger;
import creational_patterns.abstract_factory.BeefHamburger;
import creational_patterns.abstract_factory.HamburgerCreatingFactory;
import creational_patterns.abstract_factory.HamburgerCreatingFactory;
import creational_patterns.abstract_factory.VegeHamburger;
import creational_patterns.abstract_factory.VegeHamburger;

/**
 *
 * @author vadimzubchenko
 */
public class AmericanFoodFactory extends HamburgerCreatingFactory {

    @Override
    public BeefHamburger getBeefHamburger() {
        return new AmericanBeefHamburger();

    }

    @Override
    public VegeHamburger getVegeHamburger() {
        return new AmericanVegeHamburger();
    }
}
