/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainsample;

/**
 *
 * @author Администратор
 */
public class User {
    public String username, password;
    public Double money;
    
    public User(String username,String password,Double money ){
        this.money = money;
        this.password = password;
        this.username = username;
    }
}
