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
public class FacebookMessanger {
    private String faceBookToken;
    public void setMessanger(String faceBookToken){
        this.faceBookToken = faceBookToken;
    }
    
    public void sendMessage(String message){
        if(faceBookToken.isEmpty()){
            System.out.println("Invalid operation. Token mismatch.");
        }else{
            System.out.println("Facebook messanger");
            System.out.println(message);
        }
    }
}
