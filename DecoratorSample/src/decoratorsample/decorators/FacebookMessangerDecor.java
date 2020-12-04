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
public class FacebookMessangerDecor extends MessangerDecorator {
    private String login, password;
    public FacebookMessangerDecor(MessangerServ source, String login, String password){
        super(source);
        this.login = login;
        this.password = password;
    }
    
    @Override
    public void sendMessage(String message){
        super.sendMessage(message);
        System.out.println("Facebook messanger.");
        System.out.println("User: " + login);
        System.out.println(message);
    }
}
