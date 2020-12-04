/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptersample.adapters;

import adaptersample.FacebookMessanger;
import adaptersample.User;

/**
 *
 * @author Администратор
 */
public class FacebookAdapter extends FacebookMessanger {
    private FacebookMessanger messanger;
    private User user;
    
    public FacebookAdapter(FacebookMessanger messanger, User user){
        this.messanger = messanger;
        this.user = user;
    }
    @Override
    public void sendMessage(String message){
        messanger.setMessanger(user.faceBookToken);
        messanger.sendMessage(message);
    }
}
