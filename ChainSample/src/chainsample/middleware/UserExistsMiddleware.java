/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainsample.middleware;

import chainsample.User;
import java.util.List;



/**
 *
 * @author Администратор
 */
public class UserExistsMiddleware extends Middleware {
    protected List<User> users;
    public User activeUser;
    

    public UserExistsMiddleware(List<User> users) {
        this.users = users;
    }

    public boolean hasEmail(String username) {
        Boolean found = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).username.equals(username)) {
                found = true;
            }
        }
        return found;
    }

    public boolean isValidPassword(String username, String password) {
        Boolean found = false;
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                found = true;
                activeUser = user;
            }
        }
        return found;
    }
    

    public boolean check(String username, String password,User user, Double buying) {
        if (!this.hasEmail(username)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!this.isValidPassword(username, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(username, password, activeUser, buying);
    }
}
