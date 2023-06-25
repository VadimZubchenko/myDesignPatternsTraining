/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.factrory_method;

/**
 *
 * @author vadimzubchenko
 */
public class Engineer extends BeverageCreatingFactory {

    @Override
    public Beverage createBeverage() {
        return new Water();

    }

}
