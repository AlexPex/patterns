/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainsample.middleware;

import chainsample.User;

/**
 *
 * @author Администратор
 */
public class BuyingsMiddleware extends Middleware {

    public boolean check(String username, String password,User user, Double buying ) {
       if(user.money < buying){
           System.out.println("You have not enough money to commit the purchaise");
           return false;
       }
       return checkNext(username, password, user, buying);
    }
}
