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
public class AuthenticationMiddleware extends Middleware {
    
    public boolean check(String username, String password,User user, Double buying) {
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Form is not filled completely!");
            return false;
        }
        return checkNext(username, password, user, buying);
    }
}
