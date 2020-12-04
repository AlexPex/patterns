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
public class EmailMessanger implements MessangerServ{
    public String from, to = "";
    @Override
    public void sendMessage(String message){
        System.out.println("Send email message from " + from + " to "+ to +":");
        System.out.println(message);
    }
    public EmailMessanger(String from, String to){
        this.from = from;
        this.to = to;
    }
}
