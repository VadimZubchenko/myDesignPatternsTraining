/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.abstract_factory.italianFood;

import creational_patterns.abstract_factory.BeefHamburger;
import creational_patterns.abstract_factory.HamburgerCreatingFactory;
import creational_patterns.abstract_factory.VegeHamburger;
import creational_patterns.abstract_factory.italianFood.ItalianBeefHamburger;
import creational_patterns.abstract_factory.italianFood.ItalianVegeHamburger;

/**
 *
 * @author vadimzubchenko
 */
public class ItalianFoodFactory extends HamburgerCreatingFactory{


@Override
public BeefHamburger getBeefHamburger(){
return new ItalianBeefHamburger();
}
@Override
public VegeHamburger getVegeHamburger(){
return new ItalianVegeHamburger();
}
}
