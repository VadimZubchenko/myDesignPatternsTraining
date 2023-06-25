/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational_patterns.factrory_method;

/**
 *
 * @author vadimzubchenko
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Student said: ");
        BeverageCreatingFactory student = new Student();
        student.feed();

        System.out.println("Teacher said: ");
        BeverageCreatingFactory teacher = new Teacher();
        teacher.feed();
        System.out.println("Engineer said: ");
        BeverageCreatingFactory engineer = new Engineer();
        engineer.feed();
    }

}
