/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.abstract_factory;

/**
 *
 * @author vadimzubchenko
 */
public class AmericanBeefHamburger implements BeefHamburger{
    
public void makeHamburger(){

    System.out.println("Here is USA's style Hamburger.");
}

public String toString(){
        return "Here is American Beef Hamburger!";
}
}
