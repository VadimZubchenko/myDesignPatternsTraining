/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.abstract_factory;

/**
 *
 * @author vadimzubchenko
 */
public abstract class HamburgerCreatingFactory {
    

    BeefHamburger beefHamburger = null;
    VegeHamburger vegeHamburger = null;

    // Beef and Vege hamburgers creators 
    public abstract BeefHamburger createBeefHamburger();

    public abstract VegeHamburger createVegeHamburger();


    public void completeOrder() {
        order();
    }

    private void order() {

        if (beefHamburger == null) {

            beefHamburger = createBeefHamburger();
            System.out.println("You got hamburger: " + beefHamburger);

        } else {
            vegeHamburger = createVegeHamburger();
            System.out.println("You got hamburger: " + vegeHamburger);
        }

    }

}
