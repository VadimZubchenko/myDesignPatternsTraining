/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.factrory_method;

/**
 *
 * @author vadimzubchenko
 */
public class Student extends BeverageCreatingFactory {

    public Beverage createBeverage() {

        return new CocaCola();
    }

}
