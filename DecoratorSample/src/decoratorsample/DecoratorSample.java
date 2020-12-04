/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorsample;

import decoratorsample.*;
import decoratorsample.decorators.*;
/**
 *
 * @author Администратор
 */
public class DecoratorSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmailMessanger email = new EmailMessanger("student@mail.ru", "mate@mail.ru");
        //email.sendMessage("Hello. What is your name?");
        FacebookMessangerDecor facebook = new FacebookMessangerDecor(email, "student", "A123gtr");
        facebook.sendMessage("How are you? Let's meet at the cinema today");
    }
    
}
