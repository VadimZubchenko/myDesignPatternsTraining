/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.abstract_factory;

/**
 *
 * @author vadimzubchenko
 */
public class ItalianFoodFactory extends HamburgerCreatingFactory{


@Override
public BeefHamburger createBeefHamburger(){
return new ItalianBeefHamburger();
}
@Override
public VegeHamburger createVegeHamburger(){
return new ItalianVegeHamburger();
}
}
