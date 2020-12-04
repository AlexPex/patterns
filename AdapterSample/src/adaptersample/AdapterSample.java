/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptersample;

import adaptersample.adapters.FacebookAdapter;
/**
 *
 * @author Администратор
 */
public class AdapterSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       User user = new User("Alex", "passwordjjj", "Aw4565Ldfdfd--9i");
       FacebookMessanger messanger = new FacebookMessanger();
       FacebookAdapter adapter = new FacebookAdapter(messanger, user);
       adapter.sendMessage("Hello, everyone!");
       System.out.println("-----------------------------");
       User user2 = new User("Tomas", "Frpm933", "");
       FacebookAdapter adapter2 = new FacebookAdapter(messanger, user2);
       adapter2.sendMessage("Hello, everyone!");
    }
    
}
