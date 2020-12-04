/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorsample.decorators;

/**
 *
 * @author Администратор
 */
public class MessangerDecorator implements MessangerServ{
    private MessangerServ wrappee;
    
    MessangerDecorator(MessangerServ source){
        this.wrappee = source;
    }
    @Override
    public void sendMessage(String message){
        wrappee.sendMessage(message);
    }
}
