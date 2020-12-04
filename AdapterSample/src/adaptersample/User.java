/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptersample;

/**
 *
 * @author Администратор
 */
public class User {
    public String name, password, faceBookToken;
    
    public User(String name,String password, String faceBookToken){
        this.faceBookToken = faceBookToken;
        this.name = name;
        this.password = password;
    }
}
